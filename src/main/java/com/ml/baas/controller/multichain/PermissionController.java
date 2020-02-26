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
public class PermissionController {
    private static final Logger log = LoggerFactory.getLogger(ViewController.class);

    @RequestMapping(value = "/multichain/grantStreamPermissionForm", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String grantStreamPermission(@RequestParam(value = "hostIp", required = true) String hostIp,
                                        @RequestParam(value = "rpcPort", required = true) String rpcPort,
                                        @RequestParam(value = "rpcUser", required = true) String rpcUser,
                                        @RequestParam(value = "rpcUserPwd", required = true) String rpcUserPwd,
                                        @RequestParam(value = "walletAddress", required = true) String walletAddress,
                                        @RequestParam(value = "permissionIdentifier", required = true) String permissionIdentifier) {
        RestTemplate restTemplate = new RestTemplate();
        LinkedMultiValueMap body = new LinkedMultiValueMap();
        body.add("hostIp", hostIp);
        body.add("rpcPort", rpcPort);
        body.add("rpcUser", rpcUser);
        body.add("rpcUserPwd", rpcUserPwd);
        body.add("walletAddress", walletAddress);
        body.add("permissionIdentifier", permissionIdentifier);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);//form request to multichain client server
        HttpEntity httpEntity = new HttpEntity(body, headers);
        try {
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:9081/multichain-client/grantStreamPermissionForm", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }

    @RequestMapping(value = "/multichain/grantGlobalPermissionForm", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String grantGlobalPermission(@RequestParam(value = "hostIp", required = true) String hostIp,
                                        @RequestParam(value = "rpcPort", required = true) String rpcPort,
                                        @RequestParam(value = "rpcUser", required = true) String rpcUser,
                                        @RequestParam(value = "rpcUserPwd", required = true) String rpcUserPwd,
                                        @RequestParam(value = "walletAddress", required = true) String walletAddress,
                                        @RequestParam(value = "permissionIdentifier", required = true) String permissionIdentifier) {
        RestTemplate restTemplate = new RestTemplate();
        LinkedMultiValueMap body = new LinkedMultiValueMap();
        body.add("hostIp", hostIp);
        body.add("rpcPort", rpcPort);
        body.add("rpcUser", rpcUser);
        body.add("rpcUserPwd", rpcUserPwd);
        body.add("walletAddress", walletAddress);
        body.add("permissionIdentifier", permissionIdentifier);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);//form request to multichain client server
        HttpEntity httpEntity = new HttpEntity(body, headers);
        try {
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:9081/multichain-client/grantGlobalPermissionForm", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }

    /**
     * 获取节点钱包地址下的权限
     *
     * @param hostIp
     * @param rpcPort
     * @param rpcUser
     * @param rpcUserPwd
     * @param wallletAddresses
     * @param permissionIdentifier
     * @param verbose
     * @return
     */
    @RequestMapping(value = "/multichain/getBlockChainNodeWalletAddressesPermissionsForm", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String getBlockChainNodeWalletAddressesPermissions(@RequestParam(value = "hostIp", required = true) String hostIp,
                                                              @RequestParam(value = "rpcPort", required = true) String rpcPort,
                                                              @RequestParam(value = "rpcUser", required = true) String rpcUser,
                                                              @RequestParam(value = "rpcUserPwd", required = true) String rpcUserPwd,
                                                              @RequestParam(value = "wallletAddresses", required = true) String wallletAddresses,
                                                              @RequestParam(value = "permissionIdentifier", required = true) String permissionIdentifier,
                                                              @RequestParam(value = "verbose", required = true) String verbose) {
        RestTemplate restTemplate = new RestTemplate();
        LinkedMultiValueMap body = new LinkedMultiValueMap();
        body.add("hostIp", hostIp);
        body.add("rpcPort", rpcPort);
        body.add("rpcUser", rpcUser);
        body.add("rpcUserPwd", rpcUserPwd);
        body.add("wallletAddresses", wallletAddresses);
        body.add("permissionIdentifier", permissionIdentifier);
        body.add("verbose", verbose);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);//form request to multichain client server
        HttpEntity httpEntity = new HttpEntity(body, headers);
        try {
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:9081/multichain-client/getBlockChainNodeWalletAddressesPermissionsForm", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }
}
