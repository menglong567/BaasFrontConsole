package com.ml.baas.controller.multichain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author mengl
 */
@RestController
public class ViewController {
    private static final Logger log = LoggerFactory.getLogger(ViewController.class);


    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("/index");//template
        return modelAndView;
    }

    @RequestMapping("/multichainMaster")
    public ModelAndView master() {
        ModelAndView modelAndView = new ModelAndView("/multichainMasterCreate");//template
        return modelAndView;
    }

    @RequestMapping("/multichainSlave")
    public ModelAndView slave() {
        ModelAndView modelAndView = new ModelAndView("/multichainSlaveCreate");//template
        return modelAndView;
    }

    @RequestMapping("/queryBlockInfo")
    public ModelAndView queryBlockInfo() {
        ModelAndView modelAndView = new ModelAndView("/multichainQueryBlockInfo");//template
        return modelAndView;
    }

    @RequestMapping("/multichainStream")
    public ModelAndView multichainStream() {
        ModelAndView modelAndView = new ModelAndView("/multichainStreamManagement");//template
        return modelAndView;
    }

    @RequestMapping("/multichainAssetManagement")
    public ModelAndView multichainAssetManagement() {
        ModelAndView modelAndView = new ModelAndView("/multichainAssetManagement");//template
        return modelAndView;
    }

    @RequestMapping("/blockChainInfo")
    public ModelAndView blockChainInfo() {
        ModelAndView modelAndView = new ModelAndView("/multichainBlockChainInfo");//template
        return modelAndView;
    }
}
