package com.ml.baas.controller.multichain;

import com.ml.baas.model.multichain.MasterNodeParametersObj;
import com.ml.baas.model.multichain.SlaveNodeParametersObj;
import com.ml.baas.util.GSonUtil;
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
public class NodeCreateController {
    private static final Logger log = LoggerFactory.getLogger(ViewController.class);

    @RequestMapping(value = "/multichain/master/create/form", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String createMasterNodeForm(@RequestParam(value = "masterNodeName", required = true) String masterNodeName,
                                       @RequestParam(value = "namespace", required = true) String namespace,
                                       @RequestParam(value = "chainName", required = true) String chainName,
                                       @RequestParam(value = "memoryRequest", required = true) String memoryRequest,
                                       @RequestParam(value = "cpuRequest", required = true) String cpuRequest,
                                       @RequestParam(value = "memoryLimit", required = true) String memoryLimit,
                                       @RequestParam(value = "cpuLimit", required = true) String cpuLimit,
                                       @RequestParam(value = "nodeportnetworkPort", required = true) String nodeportnetworkPort,
                                       @RequestParam(value = "nodeportrpcPort", required = true) String nodeportrpcPort) {
        RestTemplate restTemplate = new RestTemplate();
        LinkedMultiValueMap body = new LinkedMultiValueMap();
        body.add("masterNodeName", masterNodeName);
        body.add("namespace", namespace);
        body.add("chainName", chainName);
        body.add("memoryRequest", memoryRequest);
        body.add("cpuRequest", cpuRequest);
        body.add("memoryLimit", memoryLimit);
        body.add("cpuLimit", cpuLimit);
        body.add("nodeportnetworkPort", nodeportnetworkPort);
        body.add("nodeportrpcPort", nodeportrpcPort);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);//form request to kubernetes client server
        HttpEntity httpEntity = new HttpEntity(body, headers);
        try {
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:8081/kubernetes-client/multichain/master/create/form", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }

    /**
     * @param masterNodeName
     * @param namespace
     * @param chainName
     * @param memoryRequest
     * @param cpuRequest
     * @param memoryLimit
     * @param cpuLimit
     * @param nodeportnetworkPort
     * @param nodeportrpcPort
     * @return
     */
    @RequestMapping(value = "/multichain/master/create/json", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String createMasterNodeJson(@RequestParam(value = "masterNodeName", required = true) String masterNodeName,
                                       @RequestParam(value = "namespace", required = true) String namespace,
                                       @RequestParam(value = "chainName", required = true) String chainName,
                                       @RequestParam(value = "memoryRequest", required = true) String memoryRequest,
                                       @RequestParam(value = "cpuRequest", required = true) String cpuRequest,
                                       @RequestParam(value = "memoryLimit", required = true) String memoryLimit,
                                       @RequestParam(value = "cpuLimit", required = true) String cpuLimit,
                                       @RequestParam(value = "nodeportnetworkPort", required = true) String nodeportnetworkPort,
                                       @RequestParam(value = "nodeportrpcPort", required = true) String nodeportrpcPort) {
        RestTemplate restTemplate = new RestTemplate();
        MasterNodeParametersObj body = new MasterNodeParametersObj();
        body.setMasterNodeName(masterNodeName);
        body.setNamespace(namespace);
        body.setChainName(chainName);
        body.setMemoryRequest(memoryRequest);
        body.setCpuRequest(cpuRequest);
        body.setMemoryLimit(memoryLimit);
        body.setCpuLimit(cpuLimit);
        body.setNodeportnetworkPort(nodeportnetworkPort);
        body.setNodeportrpcPort(nodeportrpcPort);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);//json request to kubernetes client server
        HttpEntity httpEntity = new HttpEntity(GSonUtil.getInstance().object2Json(body), headers);
        try {
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:8081/kubernetes-client/multichain/master/create/json", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }

    /**
     * @param slaveNodeName
     * @param slaveNodeNamespace
     * @param chainName
     * @param masterNodeName
     * @param masterNamespace
     * @param memoryRequest
     * @param cpuRequest
     * @param memoryLimit
     * @param cpuLimit
     * @param nodeportnetworkPort
     * @param nodeportrpcPort
     * @return String
     */
    @RequestMapping(value = "/multichain/slave/create/form", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String createSlaveNodeForm(@RequestParam(value = "slaveNodeName", required = true) String slaveNodeName,
                                      @RequestParam(value = "slaveNodeNamespace", required = true) String slaveNodeNamespace,
                                      @RequestParam(value = "chainName", required = true) String chainName,
                                      @RequestParam(value = "masterNodeName", required = true) String masterNodeName,
                                      @RequestParam(value = "masterNamespace", required = true) String masterNamespace,
                                      @RequestParam(value = "memoryRequest", required = true) String memoryRequest,
                                      @RequestParam(value = "cpuRequest", required = true) String cpuRequest,
                                      @RequestParam(value = "memoryLimit", required = true) String memoryLimit,
                                      @RequestParam(value = "cpuLimit", required = true) String cpuLimit,
                                      @RequestParam(value = "nodeportnetworkPort", required = true) String nodeportnetworkPort,
                                      @RequestParam(value = "nodeportrpcPort", required = true) String nodeportrpcPort) {
        RestTemplate restTemplate = new RestTemplate();
        LinkedMultiValueMap body = new LinkedMultiValueMap();
        body.add("slaveNodeName", slaveNodeName);
        body.add("slaveNodeNamespace", slaveNodeNamespace);
        body.add("chainName", chainName);
        body.add("masterNodeName", masterNodeName);
        body.add("masterNamespace", masterNamespace);
        body.add("memoryRequest", memoryRequest);
        body.add("cpuRequest", cpuRequest);
        body.add("memoryLimit", memoryLimit);
        body.add("cpuLimit", cpuLimit);
        body.add("nodeportnetworkPort", nodeportnetworkPort);
        body.add("nodeportrpcPort", nodeportrpcPort);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);//form request to kubernetes client server
        HttpEntity httpEntity = new HttpEntity(body, headers);
        try {
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:8081/kubernetes-client/multichain/slave/create/form", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }

    /**
     * @param slaveNodeName
     * @param slaveNodeNamespace
     * @param chainName
     * @param masterNodeName
     * @param masterNamespace
     * @param memoryRequest
     * @param cpuRequest
     * @param memoryLimit
     * @param cpuLimit
     * @param nodeportnetworkPort
     * @param nodeportrpcPort
     * @return
     */
    @RequestMapping(value = "/multichain/slave/create/json", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String createSlaveNodeJson(@RequestParam(value = "slaveNodeName", required = true) String slaveNodeName,
                                      @RequestParam(value = "slaveNodeNamespace", required = true) String slaveNodeNamespace,
                                      @RequestParam(value = "chainName", required = true) String chainName,
                                      @RequestParam(value = "masterNodeName", required = true) String masterNodeName,
                                      @RequestParam(value = "masterNamespace", required = true) String masterNamespace,
                                      @RequestParam(value = "memoryRequest", required = true) String memoryRequest,
                                      @RequestParam(value = "cpuRequest", required = true) String cpuRequest,
                                      @RequestParam(value = "memoryLimit", required = true) String memoryLimit,
                                      @RequestParam(value = "cpuLimit", required = true) String cpuLimit,
                                      @RequestParam(value = "nodeportnetworkPort", required = true) String nodeportnetworkPort,
                                      @RequestParam(value = "nodeportrpcPort", required = true) String nodeportrpcPort) {
        RestTemplate restTemplate = new RestTemplate();
        SlaveNodeParametersObj body = new SlaveNodeParametersObj();
        body.setSlaveNodeName(slaveNodeName);
        body.setSlaveNodeNamespace(slaveNodeNamespace);
        body.setChainName(chainName);
        body.setMasterNodeName(masterNodeName);
        body.setMasterNamespace(masterNamespace);
        body.setMemoryRequest(memoryRequest);
        body.setCpuRequest(cpuRequest);
        body.setMemoryLimit(memoryLimit);
        body.setCpuLimit(cpuLimit);
        body.setNodeportnetworkPort(nodeportnetworkPort);
        body.setNodeportrpcPort(nodeportrpcPort);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);//json request to kubernetes client server
        HttpEntity httpEntity = new HttpEntity(GSonUtil.getInstance().object2Json(body), headers);
        try {
            ResponseEntity<String> strbody = restTemplate.exchange("http://localhost:8081/kubernetes-client/multichain/slave/create/json", HttpMethod.POST, httpEntity, String.class);
            return strbody.getBody();
        } catch (RestClientException ex) {
            return ex.getMessage();
        }
    }
}
