package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import o.InterfaceC5670cr1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfjq implements zzgcu {
    public final /* synthetic */ zzfhc a;
    public final /* synthetic */ zzfhn b;
    public final /* synthetic */ zzcyd c;
    public final /* synthetic */ zzfjr d;

    public zzfjq(zzfjr zzfjrVar, zzfhc zzfhcVar, zzfhn zzfhnVar, zzcyd zzcydVar) {
        this.a = zzfhcVar;
        this.b = zzfhnVar;
        this.c = zzcydVar;
        this.d = zzfjrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(@InterfaceC5670cr1 Throwable th) {
        zzfhq zzfhqVar;
        zzfhc zzfhcVar = this.a;
        if (zzfhcVar == null) {
            return;
        }
        zzfhcVar.c(false);
        zzfhn zzfhnVar = this.b;
        if (zzfhnVar == null) {
            zzfhqVar = this.d.f;
            zzfhqVar.c(zzfhcVar.m());
            return;
        }
        zzfhnVar.a(zzfhcVar);
        zzfhnVar.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e8  */
    @Override // com.google.android.gms.internal.ads.zzgcu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        com.google.android.gms.ads.internal.util.client.zzu zzuVar;
        boolean z;
        int i;
        int hashCode;
        int i2;
        boolean z2;
        zzfhq zzfhqVar;
        zzfhc zzfhcVar = this.a;
        com.google.android.gms.ads.internal.util.client.zzt zztVar = (com.google.android.gms.ads.internal.util.client.zzt) obj;
        if (zzfhcVar != null) {
            if (zztVar == com.google.android.gms.ads.internal.util.client.zzt.SUCCESS) {
                z2 = true;
            } else {
                z2 = false;
            }
            zzfhcVar.c(z2);
            zzfhn zzfhnVar = this.b;
            if (zzfhnVar == null) {
                zzfhqVar = this.d.f;
                zzfhqVar.c(zzfhcVar.m());
            } else {
                zzfhnVar.a(zzfhcVar);
                zzfhnVar.h();
            }
        }
        zzcyd zzcydVar = this.c;
        if (zzcydVar != null) {
            zzuVar = this.d.d;
            String a = zzuVar.a();
            if (!TextUtils.isEmpty(a)) {
                try {
                    JSONObject jSONObject = new JSONObject(a);
                    Parcelable.Creator<com.google.android.gms.ads.internal.client.zzt> creator = com.google.android.gms.ads.internal.client.zzt.CREATOR;
                    String optString = jSONObject.optString("type");
                    String optString2 = jSONObject.optString("precision");
                    String optString3 = jSONObject.optString(FirebaseAnalytics.Param.i);
                    long optLong = jSONObject.optLong("value", 0L);
                    int hashCode2 = optString.hashCode();
                    char c = 65535;
                    if (hashCode2 != 66934) {
                        if (hashCode2 != 66944) {
                            if (hashCode2 == 1349395245 && optString.equals("ONE_PIXEL")) {
                                z = true;
                                if (!z) {
                                    if (!z) {
                                        if (!z) {
                                            i = 0;
                                        } else {
                                            optLong /= 1000;
                                            i = 3;
                                        }
                                    } else {
                                        i = 2;
                                    }
                                } else {
                                    i = 1;
                                }
                                hashCode = optString2.hashCode();
                                if (hashCode == -2131980260) {
                                    if (hashCode != 399232571) {
                                        if (hashCode == 1271254246 && optString2.equals("PUBLISHER_PROVIDED")) {
                                            c = 1;
                                        }
                                    } else if (optString2.equals("PRECISE")) {
                                        c = 2;
                                    }
                                } else if (optString2.equals("ESTIMATED")) {
                                    c = 0;
                                }
                                if (c == 0) {
                                    if (c != 1) {
                                        if (c != 2) {
                                            i2 = 0;
                                        } else {
                                            i2 = 3;
                                        }
                                    } else {
                                        i2 = 2;
                                    }
                                } else {
                                    i2 = 1;
                                }
                                zzcydVar.n1(new com.google.android.gms.ads.internal.client.zzt(i, i2, optString3, optLong));
                            }
                            z = true;
                            if (!z) {
                            }
                            hashCode = optString2.hashCode();
                            if (hashCode == -2131980260) {
                            }
                            if (c == 0) {
                            }
                            zzcydVar.n1(new com.google.android.gms.ads.internal.client.zzt(i, i2, optString3, optLong));
                        }
                        if (optString.equals("CPM")) {
                            z = false;
                            if (!z) {
                            }
                            hashCode = optString2.hashCode();
                            if (hashCode == -2131980260) {
                            }
                            if (c == 0) {
                            }
                            zzcydVar.n1(new com.google.android.gms.ads.internal.client.zzt(i, i2, optString3, optLong));
                        }
                        z = true;
                        if (!z) {
                        }
                        hashCode = optString2.hashCode();
                        if (hashCode == -2131980260) {
                        }
                        if (c == 0) {
                        }
                        zzcydVar.n1(new com.google.android.gms.ads.internal.client.zzt(i, i2, optString3, optLong));
                    }
                    if (optString.equals("CPC")) {
                        z = true;
                        if (!z) {
                        }
                        hashCode = optString2.hashCode();
                        if (hashCode == -2131980260) {
                        }
                        if (c == 0) {
                        }
                        zzcydVar.n1(new com.google.android.gms.ads.internal.client.zzt(i, i2, optString3, optLong));
                    }
                    z = true;
                    if (!z) {
                    }
                    hashCode = optString2.hashCode();
                    if (hashCode == -2131980260) {
                    }
                    if (c == 0) {
                    }
                    zzcydVar.n1(new com.google.android.gms.ads.internal.client.zzt(i, i2, optString3, optLong));
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.zzv.t().x(e, "UrlPinger.pingUrl");
                }
            }
        }
    }
}
