package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import o.C10901yE;
import o.InterfaceC11300zs1;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzesa implements zzetu {
    public final zzfcp a;
    @InterfaceC11300zs1
    public final PackageInfo b;
    public final com.google.android.gms.ads.internal.util.zzg c;

    public zzesa(zzfcp zzfcpVar, @InterfaceC11300zs1 PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.a = zzfcpVar;
        this.b = packageInfo;
        this.c = zzgVar;
    }

    private final void a(Bundle bundle) {
        int i;
        zzbfv zzbfvVar = this.a.i;
        if (zzbfvVar != null && (i = zzbfvVar.d1) != 0) {
            bundle.putBoolean("sccg_tap", zzbfvVar.e1);
            bundle.putInt("sccg_dir", i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ArrayList arrayList = this.a.g;
        zzcuv zzcuvVar = (zzcuv) obj;
        if (arrayList != null && !arrayList.isEmpty()) {
            a(zzcuvVar.b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00df, code lost:
        if (r0 == 3) goto L63;
     */
    @Override // com.google.android.gms.internal.ads.zzetu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        JSONArray optJSONArray;
        String str;
        zzfcp zzfcpVar = this.a;
        ArrayList<String> arrayList = zzfcpVar.g;
        zzcuv zzcuvVar = (zzcuv) obj;
        if (arrayList != null) {
            int i = 0;
            if (arrayList.isEmpty()) {
                zzcuvVar.a.putInt("native_version", 0);
                return;
            }
            Bundle bundle = zzcuvVar.a;
            bundle.putInt("native_version", 3);
            bundle.putStringArrayList("native_templates", arrayList);
            bundle.putStringArrayList("native_custom_templates", zzfcpVar.h);
            zzbfv zzbfvVar = zzfcpVar.i;
            if (zzbfvVar != null) {
                String str2 = "any";
                if (zzbfvVar.X > 3) {
                    bundle.putBoolean("enable_native_media_orientation", true);
                    int i2 = zzbfvVar.c1;
                    if (i2 == 1) {
                        str = "any";
                    } else if (i2 == 2) {
                        str = "landscape";
                    } else if (i2 == 3) {
                        str = "portrait";
                    } else if (i2 != 4) {
                        str = "unknown";
                    } else {
                        str = "square";
                    }
                    if (!"unknown".equals(str)) {
                        bundle.putString("native_media_orientation", str);
                    }
                }
                int i3 = zzbfvVar.Z;
                if (i3 != 0) {
                    if (i3 == 1) {
                        str2 = "portrait";
                    } else if (i3 == 2) {
                        str2 = "landscape";
                    } else {
                        str2 = "unknown";
                    }
                }
                if (!"unknown".equals(str2)) {
                    bundle.putString("native_image_orientation", str2);
                }
                bundle.putBoolean("native_multiple_images", zzbfvVar.Y0);
                bundle.putBoolean("use_custom_mute", zzbfvVar.b1);
                a(bundle);
            }
            PackageInfo packageInfo = this.b;
            if (packageInfo != null) {
                i = packageInfo.versionCode;
            }
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.c;
            if (i > zzgVar.a()) {
                zzgVar.r();
                zzgVar.Z(i);
            }
            JSONObject n = zzgVar.n();
            String str3 = null;
            if (n != null && (optJSONArray = n.optJSONArray(zzfcpVar.f)) != null) {
                str3 = optJSONArray.toString();
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("native_advanced_settings", str3);
            }
            int i4 = zzfcpVar.k;
            if (i4 > 1) {
                bundle.putInt("max_num_ads", i4);
            }
            zzbmg zzbmgVar = zzfcpVar.b;
            if (zzbmgVar != null) {
                String str4 = zzbmgVar.Z;
                if (TextUtils.isEmpty(str4)) {
                    String str5 = "p";
                    if (zzbmgVar.X >= 2) {
                        int i5 = zzbmgVar.Y0;
                        if (i5 != 2) {
                        }
                        str5 = C10901yE.l;
                        bundle.putString("ia_var", str5);
                    } else {
                        int i6 = zzbmgVar.Y;
                        if (i6 != 1) {
                            if (i6 != 2) {
                                com.google.android.gms.ads.internal.util.client.zzo.d("Instream ad video aspect ratio " + i6 + " is wrong.");
                            }
                            bundle.putString("ia_var", str5);
                        }
                        str5 = C10901yE.l;
                        bundle.putString("ia_var", str5);
                    }
                } else {
                    bundle.putString("ad_tag", str4);
                }
                bundle.putBoolean("instr", true);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.gc)).booleanValue() && zzbfvVar != null) {
                com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzbfvVar.a1;
                if (zzfwVar != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("startMuted", zzfwVar.X);
                    bundle2.putBoolean("clickToExpandRequested", zzfwVar.Z);
                    bundle2.putBoolean("customControlsRequested", zzfwVar.Y);
                    bundle.putBundle("video", bundle2);
                }
                bundle.putBoolean("disable_image_loading", zzbfvVar.Y);
                bundle.putInt("preferred_ad_choices_position", zzbfvVar.Z0);
            }
        }
    }
}
