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
public class StreamController {
    private static final Logger log = LoggerFactory.getLogger(ViewController.class);

    @RequestMapping(value = "/multichain/getAllStreamsForm", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String getAllStreams(@RequestParam(value = "hostIp", required = true) String hostIp,
                                @RequestParam(value = "rpcPort", required = true) String rpcPort,
                                @RequestParam(value = "rpcUser", required = true) String rpcUser,
                                @RequestParam(value = "rpcUserPwd", required = true) String rpcUserPwd,
                                @RequestParam(value = "streamIdentifiers", required = true) String streamIdentifiers,
                                @RequestParam(value = "verbose", required = true) String verbose) {
        RestTemplate restTemplate = new RestTemplate();
        LinkedMultiValueMap body = new LinkedMultiValueMap();
        body.add("hostIp", hostIp);
        body.add("rpcPort", rpcPort);
        body.add("rpcUser", rpcUser);
        body.add("rpcUserPwd", rpcUserPwd);
        body.add("verbose", verbose);
        body.add("streamIdentifiers", streamIdentifiers);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);//form request to multichain client server
        HttpEntity httpEntity = new HttpEntity(body, headers);
        try {
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:9081/multichain-client/getAllStreamsForm", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }

    @RequestMapping(value = "/multichain/createStreamForm", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String createStream(@RequestParam(value = "hostIp", required = true) String hostIp,
                               @RequestParam(value = "rpcPort", required = true) String rpcPort,
                               @RequestParam(value = "rpcUser", required = true) String rpcUser,
                               @RequestParam(value = "rpcUserPwd", required = true) String rpcUserPwd,
                               @RequestParam(value = "streamName", required = true) String streamName) {
        RestTemplate restTemplate = new RestTemplate();
        LinkedMultiValueMap body = new LinkedMultiValueMap();
        body.add("hostIp", hostIp);
        body.add("rpcPort", rpcPort);
        body.add("rpcUser", rpcUser);
        body.add("rpcUserPwd", rpcUserPwd);
        body.add("streamName", streamName);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);//form request to multichain client server
        HttpEntity httpEntity = new HttpEntity(body, headers);
        try {
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:9081/multichain-client/createStreamForm", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }

    @RequestMapping(value = "/multichain/subscribeStreamForm", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String subscribeStream(@RequestParam(value = "hostIp", required = true) String hostIp,
                                  @RequestParam(value = "rpcPort", required = true) String rpcPort,
                                  @RequestParam(value = "rpcUser", required = true) String rpcUser,
                                  @RequestParam(value = "rpcUserPwd", required = true) String rpcUserPwd,
                                  @RequestParam(value = "streamidentifier", required = true) String streamidentifier) {
        RestTemplate restTemplate = new RestTemplate();
        LinkedMultiValueMap body = new LinkedMultiValueMap();
        body.add("hostIp", hostIp);
        body.add("rpcPort", rpcPort);
        body.add("rpcUser", rpcUser);
        body.add("rpcUserPwd", rpcUserPwd);
        body.add("streamidentifier", streamidentifier);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);//form request to multichain client server
        HttpEntity httpEntity = new HttpEntity(body, headers);
        try {
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:9081/multichain-client/subscribeStreamForm", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }

    @RequestMapping(value = "/multichain/publishToStreamForm", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String publishToStream(@RequestParam(value = "hostIp", required = true) String hostIp,
                                  @RequestParam(value = "rpcPort", required = true) String rpcPort,
                                  @RequestParam(value = "rpcUser", required = true) String rpcUser,
                                  @RequestParam(value = "rpcUserPwd", required = true) String rpcUserPwd,
                                  @RequestParam(value = "key", required = true) String key,
                                  @RequestParam(value = "value", required = true) String value,
                                  @RequestParam(value = "streamidentifier", required = true) String streamidentifier) {
        RestTemplate restTemplate = new RestTemplate();
        LinkedMultiValueMap body = new LinkedMultiValueMap();
        body.add("hostIp", hostIp);
        body.add("rpcPort", rpcPort);
        body.add("rpcUser", rpcUser);
        body.add("rpcUserPwd", rpcUserPwd);
        body.add("key", key);
        body.add("value", value);
        body.add("streamidentifier", streamidentifier);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);//form request to multichain client server
        HttpEntity httpEntity = new HttpEntity(body, headers);
        try {
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:9081/multichain-client/publishToStreamForm", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }

    @RequestMapping(value = "/multichain/getStreamItemsForm", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String getStreamItems(@RequestParam(value = "hostIp", required = true) String hostIp,
                                 @RequestParam(value = "rpcPort", required = true) String rpcPort,
                                 @RequestParam(value = "rpcUser", required = true) String rpcUser,
                                 @RequestParam(value = "rpcUserPwd", required = true) String rpcUserPwd,
                                 @RequestParam(value = "streamidentifier", required = true) String streamidentifier,
                                 @RequestParam(value = "verbose", required = true) String verbose,
                                 @RequestParam(value = "limit", required = true) String limit) {
        RestTemplate restTemplate = new RestTemplate();
        LinkedMultiValueMap body = new LinkedMultiValueMap();
        body.add("hostIp", hostIp);
        body.add("rpcPort", rpcPort);
        body.add("rpcUser", rpcUser);
        body.add("rpcUserPwd", rpcUserPwd);
        body.add("streamidentifier", streamidentifier);
        body.add("verbose", verbose);
        body.add("limit", limit);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);//form request to multichain client server
        HttpEntity httpEntity = new HttpEntity(body, headers);
        try {
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:9081/multichain-client/getStreamItemsForm", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }
}
