/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Source code: https://github.com/jaxio/celerio/
 * Follow us on twitter: @jaxiosoft
 * This header can be customized in Celerio conf...
 * Template pack-angular:src/main/java/rest/EntityResource.java.e.vm
 */
package com.freshtax.myapp.rest;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

import com.freshtax.myapp.domain.InvItemGstr1;
import com.freshtax.myapp.dto.InvItemGstr1DTO;
import com.freshtax.myapp.dto.InvItemGstr1DTOService;
import com.freshtax.myapp.dto.support.PageRequestByExample;
import com.freshtax.myapp.dto.support.PageResponse;
import com.freshtax.myapp.repository.InvItemGstr1Repository;
import com.freshtax.myapp.rest.support.AutoCompleteQuery;

@RestController
@RequestMapping("/api/invItemGstr1s")
public class InvItemGstr1Resource {

    private final Logger log = LoggerFactory.getLogger(InvItemGstr1Resource.class);

    @Inject
    private InvItemGstr1Repository invItemGstr1Repository;
    @Inject
    private InvItemGstr1DTOService invItemGstr1DTOService;

    /**
     * Create a new InvItemGstr1.
     */
    @RequestMapping(value = "/", method = POST, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<InvItemGstr1DTO> create(@RequestBody InvItemGstr1DTO invItemGstr1DTO) throws URISyntaxException {

        log.debug("Create InvItemGstr1DTO : {}", invItemGstr1DTO);

        if (invItemGstr1DTO.isIdSet()) {
            return ResponseEntity.badRequest().header("Failure", "Cannot create InvItemGstr1 with existing ID").body(null);
        }

        InvItemGstr1DTO result = invItemGstr1DTOService.save(invItemGstr1DTO);

        return ResponseEntity.created(new URI("/api/invItemGstr1s/" + result.id)).body(result);
    }

    /**
    * Find by id InvItemGstr1.
    */
    @RequestMapping(value = "/{id}", method = GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<InvItemGstr1DTO> findById(@PathVariable Long id) throws URISyntaxException {

        log.debug("Find by id InvItemGstr1 : {}", id);

        return Optional.ofNullable(invItemGstr1DTOService.findOne(id)).map(invItemGstr1DTO -> new ResponseEntity<>(invItemGstr1DTO, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    /**
     * Update InvItemGstr1.
     */
    @RequestMapping(value = "/", method = PUT, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<InvItemGstr1DTO> update(@RequestBody InvItemGstr1DTO invItemGstr1DTO) throws URISyntaxException {

        log.debug("Update InvItemGstr1DTO : {}", invItemGstr1DTO);

        if (!invItemGstr1DTO.isIdSet()) {
            return create(invItemGstr1DTO);
        }

        InvItemGstr1DTO result = invItemGstr1DTOService.save(invItemGstr1DTO);

        return ResponseEntity.ok().body(result);
    }

    /**
     * Find a Page of InvItemGstr1 using query by example.
     */
    @RequestMapping(value = "/page", method = POST, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<PageResponse<InvItemGstr1DTO>> findAll(@RequestBody PageRequestByExample<InvItemGstr1DTO> prbe) throws URISyntaxException {
        PageResponse<InvItemGstr1DTO> pageResponse = invItemGstr1DTOService.findAll(prbe);
        return new ResponseEntity<>(pageResponse, new HttpHeaders(), HttpStatus.OK);
    }

    /**
    * Auto complete support.
    */
    @RequestMapping(value = "/complete", method = POST, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<InvItemGstr1DTO>> complete(@RequestBody AutoCompleteQuery acq) throws URISyntaxException {

        List<InvItemGstr1DTO> results = invItemGstr1DTOService.complete(acq.query, acq.maxResults);

        return new ResponseEntity<>(results, new HttpHeaders(), HttpStatus.OK);
    }

    /**
     * Delete by id InvItemGstr1.
     */
    @RequestMapping(value = "/{id}", method = DELETE, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> delete(@PathVariable Long id) throws URISyntaxException {

        log.debug("Delete by id InvItemGstr1 : {}", id);

        try {
            invItemGstr1Repository.delete(id);
            return ResponseEntity.ok().build();
        } catch (Exception x) {
            // todo: dig exception, most likely org.hibernate.exception.ConstraintViolationException
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }
}