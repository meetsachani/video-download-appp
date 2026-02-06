package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzflc {
    public final zzfln a;
    public final zzfln b;
    public final boolean c;
    public final zzflg d;
    public final zzflj e;

    public zzflc(zzflg zzflgVar, zzflj zzfljVar, zzfln zzflnVar, zzfln zzflnVar2, boolean z) {
        this.d = zzflgVar;
        this.e = zzfljVar;
        this.a = zzflnVar;
        if (zzflnVar2 == null) {
            this.b = zzfln.NONE;
        } else {
            this.b = zzflnVar2;
        }
        this.c = z;
    }

    public static zzflc a(zzflg zzflgVar, zzflj zzfljVar, zzfln zzflnVar, zzfln zzflnVar2, boolean z) {
        zzfmx.c(zzflgVar, "CreativeType is null");
        zzfmx.c(zzfljVar, "ImpressionType is null");
        zzfmx.c(zzflnVar, "Impression owner is null");
        if (zzflnVar != zzfln.NONE) {
            if (zzflgVar == zzflg.DEFINED_BY_JAVASCRIPT && zzflnVar == zzfln.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            if (zzfljVar == zzflj.DEFINED_BY_JAVASCRIPT && zzflnVar == zzfln.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            return new zzflc(zzflgVar, zzfljVar, zzflnVar, zzflnVar2, z);
        }
        throw new IllegalArgumentException("Impression owner is none");
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        zzfmt.e(jSONObject, "impressionOwner", this.a);
        zzfmt.e(jSONObject, "mediaEventsOwner", this.b);
        zzfmt.e(jSONObject, "creativeType", this.d);
        zzfmt.e(jSONObject, "impressionType", this.e);
        zzfmt.e(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.c));
        return jSONObject;
    }
}
