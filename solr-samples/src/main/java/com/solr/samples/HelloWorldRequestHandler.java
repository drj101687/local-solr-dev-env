package com.solr.samples;

import java.util.Map;
import org.apache.solr.handler.RequestHandlerBase;
import org.apache.solr.request.SolrQueryRequest;
import org.apache.solr.response.SolrQueryResponse;

public class HelloWorldRequestHandler extends RequestHandlerBase
{

    @Override
    public void handleRequestBody(SolrQueryRequest solrReq, SolrQueryResponse solrRsp)
            throws Exception {
        String name = solrReq.getParams().get("name", "World");

        Map<Object, Object> context = solrReq.getContext();


        context.forEach( (key, value) -> {
            solrRsp.add((String) key, value);
        });

        solrRsp.add("greeting", "Hello, " + name + "!");
        solrRsp.add("RequestPrincipal", solrReq.getUserPrincipal());
    }

    //////////////////////// SolrInfoMBeans methods //////////////////////

    @Override
    public String getDescription()
    {
        return "This is a custom request handler that says hello.";
    }

}
