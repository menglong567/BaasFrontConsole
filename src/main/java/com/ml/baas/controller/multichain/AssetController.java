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
public class AssetController {
    private static final Logger log = LoggerFactory.getLogger(ViewController.class);

    @RequestMapping(value = "/multichain/getAssetInfoForm", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String getAssetInfo(@RequestParam(value = "hostIp", required = true) String hostIp,
                               @RequestParam(value = "rpcPort", required = true) String rpcPort,
                               @RequestParam(value = "rpcUser", required = true) String rpcUser,
                               @RequestParam(value = "rpcUserPwd", required = true) String rpcUserPwd,
                               @RequestParam(value = "assetIdentifier", required = true) String assetIdentifier,
                               @RequestParam(value = "verbose", required = true) String verbose) {
        RestTemplate restTemplate = new RestTemplate();
        LinkedMultiValueMap body = new LinkedMultiValueMap();
        body.add("hostIp", hostIp);
        body.add("rpcPort", rpcPort);
        body.add("rpcUser", rpcUser);
        body.add("rpcUserPwd", rpcUserPwd);
        body.add("assetIdentifier", assetIdentifier);
        body.add("verbose", verbose);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);//form request to multichain client server
        HttpEntity httpEntity = new HttpEntity(body, headers);
        try {
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:9081/multichain-client/getAssetInfoForm", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }

    @RequestMapping(value = "/multichain/listBalanceAssetsForm", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String listBalanceAssets(@RequestParam(value = "hostIp", required = true) String hostIp,
                                    @RequestParam(value = "rpcPort", required = true) String rpcPort,
                                    @RequestParam(value = "rpcUser", required = true) String rpcUser,
                                    @RequestParam(value = "rpcUserPwd", required = true) String rpcUserPwd,
                                    @RequestParam(value = "assets", required = true) String assets,
                                    @RequestParam(value = "verbose", required = true) String verbose) {
        RestTemplate restTemplate = new RestTemplate();
        LinkedMultiValueMap body = new LinkedMultiValueMap();
        body.add("hostIp", hostIp);
        body.add("rpcPort", rpcPort);
        body.add("rpcUser", rpcUser);
        body.add("rpcUserPwd", rpcUserPwd);
        body.add("assets", assets);
        body.add("verbose", verbose);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);//form request to multichain client server
        HttpEntity httpEntity = new HttpEntity(body, headers);
        try {
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:9081/multichain-client/listBalanceAssetsForm", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }

    @RequestMapping(value = "/multichain/createAssetForm", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String createAsset(@RequestParam(value = "hostIp", required = true) String hostIp,
                              @RequestParam(value = "rpcPort", required = true) String rpcPort,
                              @RequestParam(value = "rpcUser", required = true) String rpcUser,
                              @RequestParam(value = "rpcUserPwd", required = true) String rpcUserPwd,
                              @RequestParam(value = "wallletAddress", required = true) String wallletAddress,
                              @RequestParam(value = "assetName", required = true) String assetName,
                              @RequestParam(value = "quantity", required = true) String quantity,
                              @RequestParam(value = "units", required = true) String units,
                              @RequestParam(value = "open", required = true) String open,
                              @RequestParam(value = "restrict", required = true) String restrict) {
        RestTemplate restTemplate = new RestTemplate();
        LinkedMultiValueMap body = new LinkedMultiValueMap();
        body.add("hostIp", hostIp);
        body.add("rpcPort", rpcPort);
        body.add("rpcUser", rpcUser);
        body.add("rpcUserPwd", rpcUserPwd);
        body.add("wallletAddress", wallletAddress);
        body.add("assetName", assetName);
        body.add("quantity", quantity);
        body.add("units", units);
        body.add("open", open);
        body.add("restrict", restrict);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);//form request to multichain client server
        HttpEntity httpEntity = new HttpEntity(body, headers);
        try {
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:9081/multichain-client/createAssetForm", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }

    @RequestMapping(value = "/multichain/getTotalBalancesForm", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String getTotalBalances(@RequestParam(value = "hostIp", required = true) String hostIp,
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
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:9081/multichain-client/getTotalBalancesForm", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }

    @RequestMapping(value = "/multichain/subscribeAssetForm", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String subscribeAsset(@RequestParam(value = "hostIp", required = true) String hostIp,
                                 @RequestParam(value = "rpcPort", required = true) String rpcPort,
                                 @RequestParam(value = "rpcUser", required = true) String rpcUser,
                                 @RequestParam(value = "rpcUserPwd", required = true) String rpcUserPwd,
                                 @RequestParam(value = "assetIdentifier", required = true) String assetIdentifier) {
        RestTemplate restTemplate = new RestTemplate();
        LinkedMultiValueMap body = new LinkedMultiValueMap();
        body.add("hostIp", hostIp);
        body.add("rpcPort", rpcPort);
        body.add("rpcUser", rpcUser);
        body.add("rpcUserPwd", rpcUserPwd);
        body.add("assetIdentifier", assetIdentifier);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);//form request to multichain client server
        HttpEntity httpEntity = new HttpEntity(body, headers);
        try {
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:9081/multichain-client/subscribeAssetForm", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }

    @RequestMapping(value = "/multichain/sendAssetToWalletAddressForm", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String sendAssetToWalletAddress(@RequestParam(value = "hostIp", required = true) String hostIp,
                                           @RequestParam(value = "rpcPort", required = true) String rpcPort,
                                           @RequestParam(value = "rpcUser", required = true) String rpcUser,
                                           @RequestParam(value = "rpcUserPwd", required = true) String rpcUserPwd,
                                           @RequestParam(value = "walletAddress", required = true) String walletAddress,
                                           @RequestParam(value = "assetIdentifier", required = true) String assetIdentifier,
                                           @RequestParam(value = "amount", required = true) String amount) {
        RestTemplate restTemplate = new RestTemplate();
        LinkedMultiValueMap body = new LinkedMultiValueMap();
        body.add("hostIp", hostIp);
        body.add("rpcPort", rpcPort);
        body.add("rpcUser", rpcUser);
        body.add("rpcUserPwd", rpcUserPwd);
        body.add("walletAddress", walletAddress);
        body.add("assetIdentifier", assetIdentifier);
        body.add("amount", amount);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);//form request to multichain client server
        HttpEntity httpEntity = new HttpEntity(body, headers);
        try {
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:9081/multichain-client/sendAssetToWalletAddressForm", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }

    /**
     * @param hostIp
     * @param rpcPort
     * @param rpcUser
     * @param rpcUserPwd
     * @param walletAddress
     * @return
     */
    @RequestMapping(value = "/multichain/getWalletAddressBalancesForm", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String getWalletAddressBalances(@RequestParam(value = "hostIp", required = true) String hostIp,
                                           @RequestParam(value = "rpcPort", required = true) String rpcPort,
                                           @RequestParam(value = "rpcUser", required = true) String rpcUser,
                                           @RequestParam(value = "rpcUserPwd", required = true) String rpcUserPwd,
                                           @RequestParam(value = "walletAddress", required = true) String walletAddress) {
        RestTemplate restTemplate = new RestTemplate();
        LinkedMultiValueMap body = new LinkedMultiValueMap();
        body.add("hostIp", hostIp);
        body.add("rpcPort", rpcPort);
        body.add("rpcUser", rpcUser);
        body.add("rpcUserPwd", rpcUserPwd);
        body.add("walletAddress", walletAddress);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);//form request to multichain client server
        HttpEntity httpEntity = new HttpEntity(body, headers);
        try {
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:9081/multichain-client/getWalletAddressBalancesForm", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }
}
