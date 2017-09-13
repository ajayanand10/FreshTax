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
import {InvGstr1} from '../invGstr1/invGstr1';

export class InvItemGstr1 {
    // Raw attributes
    iniSno : number;
    itemDesc : string;
    itemTyp : string;
    hsn : string;
    qty : number;
    uom : string;
    rate : number;
    disc : number;
    itTxval : number;
    itRt : number;
    itCpct : number;
    itCamt : number;
    itSpct : number;
    itSamt : number;
    itIpct : number;
    itIamt : number;
    itCspct : number;
    itCsamt : number;
    itTotal : number;
    id : number;
    // x-to-one
    inv : InvGstr1;


    constructor(json? : any) {
        if (json != null) {
            this.iniSno = json.iniSno;
            this.itemDesc = json.itemDesc;
            this.itemTyp = json.itemTyp;
            this.hsn = json.hsn;
            this.qty = json.qty;
            this.uom = json.uom;
            this.rate = json.rate;
            this.disc = json.disc;
            this.itTxval = json.itTxval;
            this.itRt = json.itRt;
            this.itCpct = json.itCpct;
            this.itCamt = json.itCamt;
            this.itSpct = json.itSpct;
            this.itSamt = json.itSamt;
            this.itIpct = json.itIpct;
            this.itIamt = json.itIamt;
            this.itCspct = json.itCspct;
            this.itCsamt = json.itCsamt;
            this.itTotal = json.itTotal;
            this.id = json.id;

            if (json.inv != null) {
                this.inv = new InvGstr1(json.inv);
            }
        }
    }

    // Utils

    static toArray(jsons : any[]) : InvItemGstr1[] {
        let invItemGstr1s : InvItemGstr1[] = [];
        if (jsons != null) {
            for (let json of jsons) {
                invItemGstr1s.push(new InvItemGstr1(json));
            }
        }
        return invItemGstr1s;
    }
}