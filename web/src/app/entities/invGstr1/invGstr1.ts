//
// Project home: https://github.com/jaxio/celerio-angular-quickstart
// 
// Source code generated by Celerio, an Open Source code generator by Jaxio.
// Documentation: http://www.jaxio.com/documentation/celerio/
// Source code: https://github.com/jaxio/celerio/
// Follow us on twitter: @jaxiosoft
// This header can be customized in Celerio conf...
// Template pack-angular:web/src/app/entities/entity.ts.e.vm
//

export class InvGstr1 {
    // Raw attributes
    id : number;
    gstin : string;
    state : string;
    flag : string;
    chksum : string;
    inum : string;
    idt : Date;
    invRef : string;
    invTyp : string;
    invDue : Date;
    rchrg : string;
    proAst : string;
    terms : string;
    orNo : string;
    orDt : Date;
    etin : string;
    ctin : string;
    pos : string;
    cusNotes : string;
    tnc : string;
    val : number;
    supType : string;
    ftInvProcessed : string;
    ftInvEdit : string;


    constructor(json? : any) {
        if (json != null) {
            this.id = json.id;
            this.gstin = json.gstin;
            this.state = json.state;
            this.flag = json.flag;
            this.chksum = json.chksum;
            this.inum = json.inum;
            if (json.idt != null) {
                this.idt = new Date(json.idt);
            }
            this.invRef = json.invRef;
            this.invTyp = json.invTyp;
            if (json.invDue != null) {
                this.invDue = new Date(json.invDue);
            }
            this.rchrg = json.rchrg;
            this.proAst = json.proAst;
            this.terms = json.terms;
            this.orNo = json.orNo;
            if (json.orDt != null) {
                this.orDt = new Date(json.orDt);
            }
            this.etin = json.etin;
            this.ctin = json.ctin;
            this.pos = json.pos;
            this.cusNotes = json.cusNotes;
            this.tnc = json.tnc;
            this.val = json.val;
            this.supType = json.supType;
            this.ftInvProcessed = json.ftInvProcessed;
            this.ftInvEdit = json.ftInvEdit;
        }
    }

    // Utils

    static toArray(jsons : any[]) : InvGstr1[] {
        let invGstr1s : InvGstr1[] = [];
        if (jsons != null) {
            for (let json of jsons) {
                invGstr1s.push(new InvGstr1(json));
            }
        }
        return invGstr1s;
    }
}
