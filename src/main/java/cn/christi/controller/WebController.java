package cn.christi.controller;

import cn.christi.util.GlobalConstant;
import com.alibaba.druid.stat.DruidStatManagerFacade;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 公共访问 前端控制器
 *
 * @author yubao.an
 * @since 2023-07-13
 */
@RestController
@RequestMapping(GlobalConstant.API_OPEN_PATH)
@Tag(name = "公共访问")
public class WebController {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebController.class);

    @GetMapping("/druid/stat")
    public Object druidStat() {
        return DruidStatManagerFacade.getInstance().getDataSourceStatDataList();
    }

}
