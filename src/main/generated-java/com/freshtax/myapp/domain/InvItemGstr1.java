/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Source code: https://github.com/jaxio/celerio/
 * Follow us on twitter: @jaxiosoft
 * This header can be customized in Celerio conf...
 * Template pack-angular:src/main/java/domain/Entity.java.e.vm
 */
package com.freshtax.myapp.domain;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.logging.Logger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

import com.google.common.base.MoreObjects;

@Entity
@Table(name = "devfreshtax.inv_item_gstr_1")
public class InvItemGstr1 implements Identifiable<Long>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(InvItemGstr1.class.getName());

    // Raw attributes
    private Long iniSno;
    private String itemDesc;
    private String itemTyp;
    private String hsn;
    private BigInteger qty;
    private String uom;
    private BigDecimal rate;
    private BigDecimal disc;
    private BigDecimal itTxval;
    private BigDecimal itRt;
    private Double itCpct;
    private BigDecimal itCamt;
    private Double itSpct;
    private BigDecimal itSamt;
    private Double itIpct;
    private BigDecimal itIamt;
    private Double itCspct;
    private BigDecimal itCsamt;
    private BigDecimal itTotal;
    private Long id;

    // Many to one
    private InvGstr1 inv;

    @Override
    public String entityClassName() {
        return InvItemGstr1.class.getSimpleName();
    }

    // -- [iniSno] ------------------------

    @Digits(integer = 19, fraction = 0)
    @Column(name = "ini_sno", precision = 19)
    public Long getIniSno() {
        return iniSno;
    }

    public void setIniSno(Long iniSno) {
        this.iniSno = iniSno;
    }

    public InvItemGstr1 iniSno(Long iniSno) {
        setIniSno(iniSno);
        return this;
    }
    // -- [itemDesc] ------------------------

    @Size(max = 2147483647)
    @Column(name = "item_desc", length = 2147483647)
    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public InvItemGstr1 itemDesc(String itemDesc) {
        setItemDesc(itemDesc);
        return this;
    }
    // -- [itemTyp] ------------------------

    @Size(max = 10)
    @Column(name = "item_typ", length = 10)
    public String getItemTyp() {
        return itemTyp;
    }

    public void setItemTyp(String itemTyp) {
        this.itemTyp = itemTyp;
    }

    public InvItemGstr1 itemTyp(String itemTyp) {
        setItemTyp(itemTyp);
        return this;
    }
    // -- [hsn] ------------------------

    @Size(max = 64)
    @Column(name = "hsn", length = 64)
    public String getHsn() {
        return hsn;
    }

    public void setHsn(String hsn) {
        this.hsn = hsn;
    }

    public InvItemGstr1 hsn(String hsn) {
        setHsn(hsn);
        return this;
    }
    // -- [qty] ------------------------

    @Digits(integer = 131089, fraction = 0)
    @Column(name = "qty", precision = 131089)
    public BigInteger getQty() {
        return qty;
    }

    public void setQty(BigInteger qty) {
        this.qty = qty;
    }

    public InvItemGstr1 qty(BigInteger qty) {
        setQty(qty);
        return this;
    }
    // -- [uom] ------------------------

    @Size(max = 10)
    @Column(name = "uom", length = 10)
    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public InvItemGstr1 uom(String uom) {
        setUom(uom);
        return this;
    }
    // -- [rate] ------------------------

    @Digits(integer = 9, fraction = 2)
    @Column(name = "rate", precision = 11, scale = 2)
    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public InvItemGstr1 rate(BigDecimal rate) {
        setRate(rate);
        return this;
    }
    // -- [disc] ------------------------

    @Digits(integer = 9, fraction = 2)
    @Column(name = "disc", precision = 11, scale = 2)
    public BigDecimal getDisc() {
        return disc;
    }

    public void setDisc(BigDecimal disc) {
        this.disc = disc;
    }

    public InvItemGstr1 disc(BigDecimal disc) {
        setDisc(disc);
        return this;
    }
    // -- [itTxval] ------------------------

    @Digits(integer = 9, fraction = 2)
    @Column(name = "it_txval", precision = 11, scale = 2)
    public BigDecimal getItTxval() {
        return itTxval;
    }

    public void setItTxval(BigDecimal itTxval) {
        this.itTxval = itTxval;
    }

    public InvItemGstr1 itTxval(BigDecimal itTxval) {
        setItTxval(itTxval);
        return this;
    }
    // -- [itRt] ------------------------

    @Digits(integer = 9, fraction = 2)
    @Column(name = "it_rt", precision = 11, scale = 2)
    public BigDecimal getItRt() {
        return itRt;
    }

    public void setItRt(BigDecimal itRt) {
        this.itRt = itRt;
    }

    public InvItemGstr1 itRt(BigDecimal itRt) {
        setItRt(itRt);
        return this;
    }
    // -- [itCpct] ------------------------

    @Digits(integer = 1, fraction = 2)
    @Column(name = "it_cpct", precision = 3, scale = 2)
    public Double getItCpct() {
        return itCpct;
    }

    public void setItCpct(Double itCpct) {
        this.itCpct = itCpct;
    }

    public InvItemGstr1 itCpct(Double itCpct) {
        setItCpct(itCpct);
        return this;
    }
    // -- [itCamt] ------------------------

    @Digits(integer = 9, fraction = 2)
    @Column(name = "it_camt", precision = 11, scale = 2)
    public BigDecimal getItCamt() {
        return itCamt;
    }

    public void setItCamt(BigDecimal itCamt) {
        this.itCamt = itCamt;
    }

    public InvItemGstr1 itCamt(BigDecimal itCamt) {
        setItCamt(itCamt);
        return this;
    }
    // -- [itSpct] ------------------------

    @Digits(integer = 1, fraction = 2)
    @Column(name = "it_spct", precision = 3, scale = 2)
    public Double getItSpct() {
        return itSpct;
    }

    public void setItSpct(Double itSpct) {
        this.itSpct = itSpct;
    }

    public InvItemGstr1 itSpct(Double itSpct) {
        setItSpct(itSpct);
        return this;
    }
    // -- [itSamt] ------------------------

    @Digits(integer = 9, fraction = 2)
    @Column(name = "it_samt", precision = 11, scale = 2)
    public BigDecimal getItSamt() {
        return itSamt;
    }

    public void setItSamt(BigDecimal itSamt) {
        this.itSamt = itSamt;
    }

    public InvItemGstr1 itSamt(BigDecimal itSamt) {
        setItSamt(itSamt);
        return this;
    }
    // -- [itIpct] ------------------------

    @Digits(integer = 1, fraction = 2)
    @Column(name = "it_ipct", precision = 3, scale = 2)
    public Double getItIpct() {
        return itIpct;
    }

    public void setItIpct(Double itIpct) {
        this.itIpct = itIpct;
    }

    public InvItemGstr1 itIpct(Double itIpct) {
        setItIpct(itIpct);
        return this;
    }
    // -- [itIamt] ------------------------

    @Digits(integer = 9, fraction = 2)
    @Column(name = "it_iamt", precision = 11, scale = 2)
    public BigDecimal getItIamt() {
        return itIamt;
    }

    public void setItIamt(BigDecimal itIamt) {
        this.itIamt = itIamt;
    }

    public InvItemGstr1 itIamt(BigDecimal itIamt) {
        setItIamt(itIamt);
        return this;
    }
    // -- [itCspct] ------------------------

    @Digits(integer = 1, fraction = 2)
    @Column(name = "it_cspct", precision = 3, scale = 2)
    public Double getItCspct() {
        return itCspct;
    }

    public void setItCspct(Double itCspct) {
        this.itCspct = itCspct;
    }

    public InvItemGstr1 itCspct(Double itCspct) {
        setItCspct(itCspct);
        return this;
    }
    // -- [itCsamt] ------------------------

    @Digits(integer = 9, fraction = 2)
    @Column(name = "it_csamt", precision = 11, scale = 2)
    public BigDecimal getItCsamt() {
        return itCsamt;
    }

    public void setItCsamt(BigDecimal itCsamt) {
        this.itCsamt = itCsamt;
    }

    public InvItemGstr1 itCsamt(BigDecimal itCsamt) {
        setItCsamt(itCsamt);
        return this;
    }
    // -- [itTotal] ------------------------

    @Digits(integer = 9, fraction = 2)
    @Column(name = "it_total", precision = 11, scale = 2)
    public BigDecimal getItTotal() {
        return itTotal;
    }

    public void setItTotal(BigDecimal itTotal) {
        this.itTotal = itTotal;
    }

    public InvItemGstr1 itTotal(BigDecimal itTotal) {
        setItTotal(itTotal);
        return this;
    }
    // -- [id] ------------------------

    @Override
    @Column(name = "ini_id", precision = 19)
    @GeneratedValue(strategy = IDENTITY)
    @Id
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public InvItemGstr1 id(Long id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    public boolean isIdSet() {
        return id != null;
    }

    // -----------------------------------------------------------------
    // Many to One support
    // -----------------------------------------------------------------

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: InvItemGstr1.inv ==> InvGstr1.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @JoinColumn(name = "inv_id")
    @ManyToOne
    public InvGstr1 getInv() {
        return inv;
    }

    /**
     * Set the {@link #inv} without adding this InvItemGstr1 instance on the passed {@link #inv}
     */
    public void setInv(InvGstr1 inv) {
        this.inv = inv;
    }

    public InvItemGstr1 inv(InvGstr1 inv) {
        setInv(inv);
        return this;
    }

    /**
     * Apply the default values.
     */
    public InvItemGstr1 withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof InvItemGstr1 && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this InvItemGstr1 instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this) //
                .add("iniSno", getIniSno()) //
                .add("itemDesc", getItemDesc()) //
                .add("itemTyp", getItemTyp()) //
                .add("hsn", getHsn()) //
                .add("qty", getQty()) //
                .add("uom", getUom()) //
                .add("rate", getRate()) //
                .add("disc", getDisc()) //
                .add("itTxval", getItTxval()) //
                .add("itRt", getItRt()) //
                .add("itCpct", getItCpct()) //
                .add("itCamt", getItCamt()) //
                .add("itSpct", getItSpct()) //
                .add("itSamt", getItSamt()) //
                .add("itIpct", getItIpct()) //
                .add("itIamt", getItIamt()) //
                .add("itCspct", getItCspct()) //
                .add("itCsamt", getItCsamt()) //
                .add("itTotal", getItTotal()) //
                .add("id", getId()) //
                .toString();
    }
}