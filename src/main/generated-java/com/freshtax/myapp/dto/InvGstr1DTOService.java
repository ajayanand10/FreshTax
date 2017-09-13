/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Source code: https://github.com/jaxio/celerio/
 * Follow us on twitter: @jaxiosoft
 * This header can be customized in Celerio conf...
 * Template pack-angular:src/main/java/dto/EntityDTOService.java.e.vm
 */
package com.freshtax.myapp.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.freshtax.myapp.domain.InvGstr1;
import com.freshtax.myapp.domain.InvGstr1_;
import com.freshtax.myapp.domain.InvItemGstr1;
import com.freshtax.myapp.dto.support.PageRequestByExample;
import com.freshtax.myapp.dto.support.PageResponse;
import com.freshtax.myapp.repository.InvGstr1Repository;

/**
 * A simple DTO Facility for InvGstr1.
 */
@Service
public class InvGstr1DTOService {

    @Inject
    private InvGstr1Repository invGstr1Repository;
    
    @Inject
    private InvItemGstr1DTOService invItemGstr1DTOService;
    

    @Transactional(readOnly = true)
    public InvGstr1DTO findOne(Long id) {
        return toDTO(invGstr1Repository.findOne(id));
    }

    @Transactional(readOnly = true)
    public List<InvGstr1DTO> complete(String query, int maxResults) {
        List<InvGstr1> results = invGstr1Repository.complete(query, maxResults);
        return results.stream().map(this::toDTO).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public PageResponse<InvGstr1DTO> findAll(PageRequestByExample<InvGstr1DTO> req) {
        Example<InvGstr1> example = null;
        InvGstr1 invGstr1 = toEntity(req.example);

        if (invGstr1 != null) {
            ExampleMatcher matcher = ExampleMatcher.matching() //
                    .withMatcher(InvGstr1_.gstin.getName(), match -> match.ignoreCase().startsWith())
                    .withMatcher(InvGstr1_.state.getName(), match -> match.ignoreCase().startsWith())
                    .withMatcher(InvGstr1_.flag.getName(), match -> match.ignoreCase().startsWith())
                    .withMatcher(InvGstr1_.chksum.getName(), match -> match.ignoreCase().startsWith())
                    .withMatcher(InvGstr1_.inum.getName(), match -> match.ignoreCase().startsWith())
                    .withMatcher(InvGstr1_.invRef.getName(), match -> match.ignoreCase().startsWith())
                    .withMatcher(InvGstr1_.invTyp.getName(), match -> match.ignoreCase().startsWith())
                    .withMatcher(InvGstr1_.rchrg.getName(), match -> match.ignoreCase().startsWith())
                    .withMatcher(InvGstr1_.proAst.getName(), match -> match.ignoreCase().startsWith())
                    .withMatcher(InvGstr1_.terms.getName(), match -> match.ignoreCase().startsWith())
                    .withMatcher(InvGstr1_.orNo.getName(), match -> match.ignoreCase().startsWith())
                    .withMatcher(InvGstr1_.etin.getName(), match -> match.ignoreCase().startsWith())
                    .withMatcher(InvGstr1_.ctin.getName(), match -> match.ignoreCase().startsWith())
                    .withMatcher(InvGstr1_.pos.getName(), match -> match.ignoreCase().startsWith())
                    .withMatcher(InvGstr1_.cusNotes.getName(), match -> match.ignoreCase().startsWith())
                    .withMatcher(InvGstr1_.tnc.getName(), match -> match.ignoreCase().startsWith())
                    .withMatcher(InvGstr1_.supType.getName(), match -> match.ignoreCase().startsWith())
                    .withMatcher(InvGstr1_.ftInvProcessed.getName(), match -> match.ignoreCase().startsWith())
                    .withMatcher(InvGstr1_.ftInvEdit.getName(), match -> match.ignoreCase().startsWith());

            example = Example.of(invGstr1, matcher);
        }

        Page<InvGstr1> page;
        if (example != null) {
            page = invGstr1Repository.findAll(example, req.toPageable());
        } else {
            page = invGstr1Repository.findAll(req.toPageable());
        }

        List<InvGstr1DTO> content = page.getContent().stream().map(this::toDTO).collect(Collectors.toList());
        return new PageResponse<>(page.getTotalPages(), page.getTotalElements(), content);
    }

    /**
     * Save the passed dto as a new entity or update the corresponding entity if any.
     */
    @Transactional
    public InvGstr1DTO save(InvGstr1DTO dto) {
        if (dto == null) {
            return null;
        }
        InvGstr1DTO invoiceDTO = null;	
        final InvGstr1 invGstr1;

        if (dto.isIdSet()) {
            InvGstr1 invGstr1Tmp = invGstr1Repository.findOne(dto.id);
            if (invGstr1Tmp != null) {
                invGstr1 = invGstr1Tmp;
                invoiceDTO=toDTO(invGstr1);
            } else {
                invGstr1 = new InvGstr1();
                invGstr1.setId(dto.id);
                invGstr1.setGstin(dto.gstin);
                invGstr1.setState(dto.state);
                invGstr1.setFlag(dto.flag);
                invGstr1.setChksum(dto.chksum);
                invGstr1.setInum(dto.inum);
                invGstr1.setIdt(dto.idt);
                invGstr1.setInvRef(dto.invRef);
                invGstr1.setInvTyp(dto.invTyp);
                invGstr1.setInvDue(dto.invDue);
                invGstr1.setRchrg(dto.rchrg);
                invGstr1.setProAst(dto.proAst);
                invGstr1.setTerms(dto.terms);
                invGstr1.setOrNo(dto.orNo);
                invGstr1.setOrDt(dto.orDt);
                invGstr1.setEtin(dto.etin);
                invGstr1.setCtin(dto.ctin);
                invGstr1.setPos(dto.pos);
                invGstr1.setCusNotes(dto.cusNotes);
                invGstr1.setTnc(dto.tnc);
                invGstr1.setVal(dto.val);
                invGstr1.setSupType(dto.supType);
                invGstr1.setFtInvProcessed(dto.ftInvProcessed);
                invGstr1.setFtInvEdit(dto.ftInvEdit);
                //added by ajay
                List<InvItemGstr1> items = new ArrayList<InvItemGstr1>();
                if(null != dto.invoiceItems)
                {
        	        for(InvItemGstr1DTO itemDTO:dto.invoiceItems)
        	        {
        	        	InvItemGstr1 item = invItemGstr1DTOService.toEntity(itemDTO);
        	        	items.add(item);
        	        }
                }
                invGstr1.setInvoiceItems(items);

                invoiceDTO = toDTO(invGstr1Repository.save(invGstr1));
            }
        }
        return invoiceDTO;
       }

    /**
     * Converts the passed invGstr1 to a DTO.
     */
    public InvGstr1DTO toDTO(InvGstr1 invGstr1) {
        return toDTO(invGstr1, 1);
    }
    
    /**
     * Converts the passed invoices to a DTO.
     */
    public List<InvGstr1DTO> toDTO(List<InvGstr1> invoices) {
    	List<InvGstr1DTO> invoiceDTOs = new ArrayList<>();
    	for(InvGstr1 invoice:invoices)
    		invoiceDTOs.add(toDTO(invoice, 1));
        return invoiceDTOs;
    }
    
    /**
     * Converts the passed invGstr1 to a DTO. The depth is used to control the
     * amount of association you want. It also prevents potential infinite serialization cycles.
     *
     * @param invGstr1
     * @param depth the depth of the serialization. A depth equals to 0, means no x-to-one association will be serialized.
     *              A depth equals to 1 means that xToOne associations will be serialized. 2 means, xToOne associations of
     *              xToOne associations will be serialized, etc.
     */
    public InvGstr1DTO toDTO(InvGstr1 invGstr1, int depth) {
        if (invGstr1 == null) {
            return null;
        }

        InvGstr1DTO dto = new InvGstr1DTO();

        dto.id = invGstr1.getId();
        dto.gstin = invGstr1.getGstin();
        dto.state = invGstr1.getState();
        dto.flag = invGstr1.getFlag();
        dto.chksum = invGstr1.getChksum();
        dto.inum = invGstr1.getInum();
        dto.idt = invGstr1.getIdt();
        dto.invRef = invGstr1.getInvRef();
        dto.invTyp = invGstr1.getInvTyp();
        dto.invDue = invGstr1.getInvDue();
        dto.rchrg = invGstr1.getRchrg();
        dto.proAst = invGstr1.getProAst();
        dto.terms = invGstr1.getTerms();
        dto.orNo = invGstr1.getOrNo();
        dto.orDt = invGstr1.getOrDt();
        dto.etin = invGstr1.getEtin();
        dto.ctin = invGstr1.getCtin();
        dto.pos = invGstr1.getPos();
        dto.cusNotes = invGstr1.getCusNotes();
        dto.tnc = invGstr1.getTnc();
        dto.val = invGstr1.getVal();
        dto.supType = invGstr1.getSupType();
        dto.ftInvProcessed = invGstr1.getFtInvProcessed();
        dto.ftInvEdit = invGstr1.getFtInvEdit();
        if (depth-- > 0) {
        	dto.invoiceItems = invItemGstr1DTOService.toDTO(invGstr1.getInvoiceItems());
        }

        return dto;
    }

    /**
     * Converts the passed dto to a InvGstr1.
     * Convenient for query by example.
     */
    public InvGstr1 toEntity(InvGstr1DTO dto) {
        return toEntity(dto, 1);
    }

    /**
     * Converts the passed dto to a InvGstr1.
     * Convenient for query by example.
     */
    public InvGstr1 toEntity(InvGstr1DTO dto, int depth) {
        if (dto == null) {
            return null;
        }

        InvGstr1 invGstr1 = new InvGstr1();

        invGstr1.setId(dto.id);
        invGstr1.setGstin(dto.gstin);
        invGstr1.setState(dto.state);
        invGstr1.setFlag(dto.flag);
        invGstr1.setChksum(dto.chksum);
        invGstr1.setInum(dto.inum);
        invGstr1.setIdt(dto.idt);
        invGstr1.setInvRef(dto.invRef);
        invGstr1.setInvTyp(dto.invTyp);
        invGstr1.setInvDue(dto.invDue);
        invGstr1.setRchrg(dto.rchrg);
        invGstr1.setProAst(dto.proAst);
        invGstr1.setTerms(dto.terms);
        invGstr1.setOrNo(dto.orNo);
        invGstr1.setOrDt(dto.orDt);
        invGstr1.setEtin(dto.etin);
        invGstr1.setCtin(dto.ctin);
        invGstr1.setPos(dto.pos);
        invGstr1.setCusNotes(dto.cusNotes);
        invGstr1.setTnc(dto.tnc);
        invGstr1.setVal(dto.val);
        invGstr1.setSupType(dto.supType);
        invGstr1.setFtInvProcessed(dto.ftInvProcessed);
        invGstr1.setFtInvEdit(dto.ftInvEdit);
        if (depth-- > 0) {
//        	invGstr1.setInvoiceItems(invItemGstr1DTOService.toEntity(dto.invoiceItems));
        }

        return invGstr1;
    }

	public List<InvGstr1DTO> getAll() {
		return toDTO(invGstr1Repository.findAll());
	}

}