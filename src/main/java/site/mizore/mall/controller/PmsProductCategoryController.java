package site.mizore.mall.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import site.mizore.mall.common.api.CommonPage;
import site.mizore.mall.common.api.CommonResult;
import site.mizore.mall.dto.PmsProductCategoryParam;
import site.mizore.mall.dto.PmsProductCategoryWithChildrenItem;
import site.mizore.mall.mbg.model.PmsProductCategory;
import site.mizore.mall.service.PmsProductCategoryService;

import java.util.List;

/**
 * 商品分类管理Controller
 */
@Api(tags = "PmsProductCategoryController",description = "商品分类管理")
@Controller
@RequestMapping("/productCategory")
public class PmsProductCategoryController {

    @Autowired
    private PmsProductCategoryService productCategoryService;

    @ApiModelProperty("添加商品分类")
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@Validated @RequestBody PmsProductCategoryParam productCategoryParam) {
        int count=productCategoryService.create(productCategoryParam);
        if(count>0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiModelProperty("更新商品分类")
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@PathVariable(value = "id") Long id,
                               @Validated @RequestBody PmsProductCategoryParam productCategoryParam) {
        int count = productCategoryService.update(id,productCategoryParam);
        if(count>0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiModelProperty("分页查询商品分类")
    @RequestMapping(value = "/list/{parentId}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult list(@PathVariable(value = "parentId") Long id,
                             @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize,
                             @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum) {
        List<PmsProductCategory> list = productCategoryService.getList(id,pageSize,pageNum);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiModelProperty("根据id获取商品分类")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getItem(@PathVariable(value = "id") Long id) {
        PmsProductCategory productCategory= productCategoryService.getItem(id);
        return CommonResult.success(productCategory);
    }

    @ApiModelProperty("根据id删除商品分类")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@PathVariable(value = "id") Long id) {
        int count =productCategoryService.delete(id);
        if(count>0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiModelProperty("修改导航栏显示状态")
    @RequestMapping(value = "/update/navStatus",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateNavStatus(@RequestParam("ids") List<Long> ids,
                                        @RequestParam("navStatus") Integer navStatus) {
        int count=productCategoryService.updateNavStatus(ids,navStatus);
        if(count>0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiModelProperty("修改显示状态")
    @RequestMapping(value = "/update/showStatus",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateShowStatus(@RequestParam("ids") List<Long> ids,
                                         @RequestParam("navStatus") Integer showStatus) {
        int count=productCategoryService.updateShowStatus(ids,showStatus);
        if(count>0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiModelProperty("获取所有一级分类及其子分类")
    @RequestMapping(value = "/list/withChildren",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult listWithChildren() {
        List<PmsProductCategoryWithChildrenItem> list=productCategoryService.listWithChildren();
        return CommonResult.success(list);
    }

}
