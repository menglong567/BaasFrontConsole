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
public class BlockChainController {
    private static final Logger log = LoggerFactory.getLogger(ViewController.class);

    @RequestMapping(value = "/multichain/getBlockchainParamsForm", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String getBlockchainParamsForm(@RequestParam(value = "hostIp", required = true) String hostIp,
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
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:9081/multichain-client/getBlockchainParamsForm", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }

    @RequestMapping(value = "/multichain/getRuntimeParamsForm", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String getRuntimeParamsForm(@RequestParam(value = "hostIp", required = true) String hostIp,
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
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:9081/multichain-client/getRuntimeParamsForm", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }

    @RequestMapping(value = "/multichain/getBlockChainInfoForm", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String getBlockChainInfoForm(@RequestParam(value = "hostIp", required = true) String hostIp,
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
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:9081/multichain-client/getBlockChainInfoForm", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }

    @RequestMapping(value = "/multichain/getNetworkInfoForm", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String getNetworkInfoForm(@RequestParam(value = "hostIp", required = true) String hostIp,
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
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:9081/multichain-client/getNetworkInfoForm", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }

    @RequestMapping(value = "/multichain/getBlockChainNodeWalletAddressesForm", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String getBlockChainNodeWalletAddressesForm(@RequestParam(value = "hostIp", required = true) String hostIp,
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
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:9081/multichain-client/getBlockChainNodeWalletAddressesForm", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }


    @RequestMapping(value = "/multichain/getNewWalletAddressForm", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String getNewWalletAddressForm(@RequestParam(value = "hostIp", required = true) String hostIp,
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
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:9081/multichain-client/getNewWalletAddressForm", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }

    @RequestMapping(value = "/multichain/getWalletInfoForm", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String getWalletInfoForm(@RequestParam(value = "hostIp", required = true) String hostIp,
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
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:9081/multichain-client/getWalletInfoForm", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }
}
