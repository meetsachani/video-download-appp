package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpg;
import java.util.Arrays;
import o.C10901yE;
import o.InterfaceC10697xN2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzgf {
    public final String a;
    public final Bundle b;
    public Bundle c;
    public final /* synthetic */ zzgd d;

    public zzgf(zzgd zzgdVar, String str, Bundle bundle) {
        this.d = zzgdVar;
        Preconditions.l(str);
        this.a = str;
        this.b = new Bundle();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0120 A[Catch: NumberFormatException | JSONException -> 0x0128, TRY_LEAVE, TryCatch #1 {NumberFormatException | JSONException -> 0x0128, blocks: (B:9:0x0025, B:42:0x0091, B:43:0x00a2, B:45:0x00a8, B:47:0x00b6, B:49:0x00c8, B:50:0x00d1, B:51:0x00d5, B:53:0x00db, B:55:0x00e9, B:57:0x00fb, B:58:0x0104, B:59:0x0108, B:60:0x0114, B:61:0x0120, B:20:0x0052, B:23:0x005c, B:26:0x0066, B:29:0x0070, B:32:0x007a), top: B:75:0x0025, outer: #0 }] */
    @InterfaceC10697xN2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle a() {
        JSONObject jSONObject;
        String string;
        String string2;
        int hashCode;
        char c;
        if (this.c == null) {
            String string3 = this.d.F().getString(this.a, null);
            if (string3 != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string3);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            jSONObject = jSONArray.getJSONObject(i);
                            string = jSONObject.getString(GoogleApiAvailabilityLight.e);
                            string2 = jSONObject.getString("t");
                            hashCode = string2.hashCode();
                        } catch (NumberFormatException | JSONException unused) {
                            this.d.j().G().a("Error reading value from SharedPreferences. Value dropped");
                        }
                        if (hashCode != 100) {
                            if (hashCode != 108) {
                                if (hashCode != 115) {
                                    if (hashCode != 3352) {
                                        if (hashCode == 3445 && string2.equals("la")) {
                                            c = 4;
                                            if (c == 0) {
                                                if (c != 1) {
                                                    if (c != 2) {
                                                        if (c != 3) {
                                                            if (c != 4) {
                                                                this.d.j().G().b("Unrecognized persisted bundle type. Type", string2);
                                                            } else if (zzpg.a() && this.d.d().s(zzbi.M0)) {
                                                                JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                                int length = jSONArray2.length();
                                                                long[] jArr = new long[length];
                                                                for (int i2 = 0; i2 < length; i2++) {
                                                                    jArr[i2] = jSONArray2.optLong(i2);
                                                                }
                                                                bundle.putLongArray(string, jArr);
                                                            }
                                                        } else if (zzpg.a() && this.d.d().s(zzbi.M0)) {
                                                            JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                                            int length2 = jSONArray3.length();
                                                            int[] iArr = new int[length2];
                                                            for (int i3 = 0; i3 < length2; i3++) {
                                                                iArr[i3] = jSONArray3.optInt(i3);
                                                            }
                                                            bundle.putIntArray(string, iArr);
                                                        }
                                                    } else {
                                                        bundle.putLong(string, Long.parseLong(jSONObject.getString("v")));
                                                    }
                                                } else {
                                                    bundle.putDouble(string, Double.parseDouble(jSONObject.getString("v")));
                                                }
                                            } else {
                                                bundle.putString(string, jSONObject.getString("v"));
                                            }
                                        }
                                        c = 65535;
                                        if (c == 0) {
                                        }
                                    } else {
                                        if (string2.equals("ia")) {
                                            c = 3;
                                            if (c == 0) {
                                            }
                                        }
                                        c = 65535;
                                        if (c == 0) {
                                        }
                                    }
                                } else {
                                    if (string2.equals("s")) {
                                        c = 0;
                                        if (c == 0) {
                                        }
                                    }
                                    c = 65535;
                                    if (c == 0) {
                                    }
                                }
                            } else {
                                if (string2.equals(C10901yE.l)) {
                                    c = 2;
                                    if (c == 0) {
                                    }
                                }
                                c = 65535;
                                if (c == 0) {
                                }
                            }
                        } else {
                            if (string2.equals("d")) {
                                c = 1;
                                if (c == 0) {
                                }
                            }
                            c = 65535;
                            if (c == 0) {
                            }
                        }
                    }
                    this.c = bundle;
                } catch (JSONException unused2) {
                    this.d.j().G().a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.c == null) {
                this.c = this.b;
            }
        }
        return this.c;
    }

    @InterfaceC10697xN2
    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.d.F().edit();
        if (bundle.size() == 0) {
            edit.remove(this.a);
        } else {
            edit.putString(this.a, c(bundle));
        }
        edit.apply();
        this.c = bundle;
    }

    public final String c(Bundle bundle) {
        JSONArray jSONArray = new JSONArray();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(GoogleApiAvailabilityLight.e, str);
                    if (zzpg.a() && this.d.d().s(zzbi.M0)) {
                        if (obj instanceof String) {
                            jSONObject.put("v", String.valueOf(obj));
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("v", String.valueOf(obj));
                            jSONObject.put("t", C10901yE.l);
                        } else if (obj instanceof int[]) {
                            jSONObject.put("v", Arrays.toString((int[]) obj));
                            jSONObject.put("t", "ia");
                        } else if (obj instanceof long[]) {
                            jSONObject.put("v", Arrays.toString((long[]) obj));
                            jSONObject.put("t", "la");
                        } else if (obj instanceof Double) {
                            jSONObject.put("v", String.valueOf(obj));
                            jSONObject.put("t", "d");
                        } else {
                            this.d.j().G().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                    } else {
                        jSONObject.put("v", String.valueOf(obj));
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", C10901yE.l);
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            this.d.j().G().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                    }
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    this.d.j().G().b("Cannot serialize bundle value to SharedPreferences", e);
                }
            }
        }
        return jSONArray.toString();
    }
}
