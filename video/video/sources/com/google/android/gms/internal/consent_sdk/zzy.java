package com.google.android.gms.internal.consent_sdk;

import java.util.HashSet;
import o.InterfaceC7011iK;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzy {
    public final zzz a;
    public final zzcl b;
    public int c = 0;
    public InterfaceC7011iK.d d = InterfaceC7011iK.d.UNKNOWN;

    public zzy(zzz zzzVar, zzcl zzclVar) {
        this.a = zzzVar;
        this.b = zzclVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzab a() throws zzg {
        boolean z;
        zzaq zzaqVar;
        zzbq zzbqVar;
        zzaq zzaqVar2;
        String str;
        zze zzeVar;
        zzao zzaoVar;
        zzcl zzclVar = this.b;
        int i = zzclVar.f;
        if (i == 8) {
            z = true;
        } else {
            z = false;
        }
        zzz zzzVar = this.a;
        zzaqVar = zzzVar.c;
        zzaqVar.h(z);
        int i2 = i - 1;
        if (i != 0) {
            switch (i2) {
                case 1:
                case 2:
                case 3:
                    this.c = 3;
                    break;
                case 4:
                    this.c = 2;
                    break;
                case 5:
                    this.c = 1;
                    break;
                case 6:
                    throw new zzg(1, "Invalid response from server: ".concat(String.valueOf(zzclVar.c)));
                case 7:
                    throw new zzg(3, "Publisher misconfiguration: ".concat(String.valueOf(zzclVar.c)));
                default:
                    throw new zzg(1, "Invalid response from server.");
            }
            int i3 = zzclVar.g;
            int i4 = i3 - 1;
            if (i3 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        this.d = InterfaceC7011iK.d.NOT_REQUIRED;
                    } else {
                        throw new zzg(1, "Invalid response from server.");
                    }
                } else {
                    this.d = InterfaceC7011iK.d.REQUIRED;
                }
                String str2 = zzclVar.a;
                if (str2 == null) {
                    zzbqVar = null;
                } else {
                    zzbqVar = new zzbq(zzclVar.b, str2);
                }
                zzaqVar2 = zzzVar.c;
                zzaqVar2.j(new HashSet(zzclVar.d));
                for (zzck zzckVar : zzclVar.e) {
                    int i5 = zzckVar.b;
                    int i6 = i5 - 1;
                    if (i5 != 0) {
                        if (i6 != 0) {
                            if (i6 != 1) {
                                if (i6 == 2) {
                                    str = "clear";
                                }
                            } else {
                                str = "write";
                            }
                            if (str == null) {
                                zzeVar = zzzVar.a;
                                String str3 = zzckVar.a;
                                zzaoVar = zzzVar.b;
                                zzeVar.b(str, str3, zzaoVar);
                            }
                        }
                        str = null;
                        if (str == null) {
                        }
                    } else {
                        throw null;
                    }
                }
                return new zzab(this.c, this.d, zzbqVar, null);
            }
            throw null;
        }
        throw null;
    }
}
