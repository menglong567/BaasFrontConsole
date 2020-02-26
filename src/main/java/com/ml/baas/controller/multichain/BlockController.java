package com.ml.baas.controller.multichain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 * @author mengl
 */
@RestController
public class BlockController {
    private static final Logger log = LoggerFactory.getLogger(ViewController.class);

    @RequestMapping(value = "/multichain/getBlockHashForm", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String getBlockHashForm(@RequestParam(value = "hostIp", required = true) String hostIp,
                                   @RequestParam(value = "rpcPort", required = true) String rpcPort,
                                   @RequestParam(value = "rpcUser", required = true) String rpcUser,
                                   @RequestParam(value = "rpcUserPwd", required = true) String rpcUserPwd,
                                   @RequestParam(value = "blockHeight", required = true) String blockHeight) {
        RestTemplate restTemplate = new RestTemplate();
        LinkedMultiValueMap body = new LinkedMultiValueMap();
        body.add("hostIp", hostIp);
        body.add("rpcPort", rpcPort);
        body.add("rpcUser", rpcUser);
        body.add("rpcUserPwd", rpcUserPwd);
        body.add("blockHeight", blockHeight);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);//form request to multichain client server
        HttpEntity httpEntity = new HttpEntity(body, headers);
        try {
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:9081/multichain-client/getBlockHashForm", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }

    @RequestMapping(value = "/multichain/listBlocksForm", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String listBlocksForm(@RequestParam(value = "hostIp", required = true) String hostIp,
                                 @RequestParam(value = "rpcPort", required = true) String rpcPort,
                                 @RequestParam(value = "rpcUser", required = true) String rpcUser,
                                 @RequestParam(value = "rpcUserPwd", required = true) String rpcUserPwd,
                                 @RequestParam(value = "blockIdentifiers", required = true) String blockIdentifiers,
                                 @RequestParam(value = "verbose", required = true) String verbose) {
        RestTemplate restTemplate = new RestTemplate();
        LinkedMultiValueMap body = new LinkedMultiValueMap();
        body.add("hostIp", hostIp);
        body.add("rpcPort", rpcPort);
        body.add("rpcUser", rpcUser);
        body.add("rpcUserPwd", rpcUserPwd);
        body.add("blockIdentifiers", blockIdentifiers);
        body.add("verbose", verbose);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);//form request to multichain client server
        HttpEntity httpEntity = new HttpEntity(body, headers);
        try {
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:9081/multichain-client/listBlocksForm", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }

    @RequestMapping(value = "/multichain/getLastBlockInfoForm", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String getLastBlockInfoForm(@RequestParam(value = "hostIp", required = true) String hostIp,
                                       @RequestParam(value = "rpcPort", required = true) String rpcPort,
                                       @RequestParam(value = "rpcUser", required = true) String rpcUser,
                                       @RequestParam(value = "rpcUserPwd", required = true) String rpcUserPwd) {
        RestTemplate restTemplate = new RestTemplate();
        LinkedMultiValueMap body = new LinkedMultiValueMap();
        body.add("hostIp", hostIp);
        body.add("rpcPort", rpcPort);
        body.add("rpcUser", rpcUser);
        body.add("rpcUserPwd", rpcUserPwd);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);//form request to multichain client server
        HttpEntity httpEntity = new HttpEntity(body, headers);
        try {
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:9081/multichain-client/getLastBlockInfoForm", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }

    @RequestMapping(value = "/multichain/getBlockCountForm", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String getBlockCountForm(@RequestParam(value = "hostIp", required = true) String hostIp,
                                    @RequestParam(value = "rpcPort", required = true) String rpcPort,
                                    @RequestParam(value = "rpcUser", required = true) String rpcUser,
                                    @RequestParam(value = "rpcUserPwd", required = true) String rpcUserPwd) {
        RestTemplate restTemplate = new RestTemplate();
        LinkedMultiValueMap body = new LinkedMultiValueMap();
        body.add("hostIp", hostIp);
        body.add("rpcPort", rpcPort);
        body.add("rpcUser", rpcUser);
        body.add("rpcUserPwd", rpcUserPwd);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);//form request to multichain client server
        HttpEntity httpEntity = new HttpEntity(body, headers);
        try {
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:9081/multichain-client/getBlockCountForm", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }

    @RequestMapping(value = "/multichain/getBlockInfoForm", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String getBlockInfoForm(@RequestParam(value = "hostIp", required = true) String hostIp,
                                   @RequestParam(value = "rpcPort", required = true) String rpcPort,
                                   @RequestParam(value = "rpcUser", required = true) String rpcUser,
                                   @RequestParam(value = "rpcUserPwd", required = true) String rpcUserPwd,
                                   @RequestParam(value = "blockHeight", required = true) String blockHeight) {
        RestTemplate restTemplate = new RestTemplate();
        LinkedMultiValueMap body = new LinkedMultiValueMap();
        body.add("hostIp", hostIp);
        body.add("rpcPort", rpcPort);
        body.add("rpcUser", rpcUser);
        body.add("rpcUserPwd", rpcUserPwd);
        body.add("blockHeight", blockHeight);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);//form request to multichain client server
        HttpEntity httpEntity = new HttpEntity(body, headers);
        try {
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:9081/multichain-client/getBlockInfoForm", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }
}
