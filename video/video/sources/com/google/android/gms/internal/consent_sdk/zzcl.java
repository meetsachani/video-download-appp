package com.google.android.gms.internal.consent_sdk;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C3771Nr1;
import o.C9642t32;
import o.InterfaceC11300zs1;

/* loaded from: classes3.dex */
public final class zzcl {
    @InterfaceC11300zs1
    public String a;
    @InterfaceC11300zs1
    public String b;
    @InterfaceC11300zs1
    public String c;
    public List d;
    public List e;
    public int f = 1;
    public int g;

    public zzcl() {
        List list = Collections.EMPTY_LIST;
        this.d = list;
        this.e = list;
        this.g = 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzcl a(JsonReader jsonReader) throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        zzcl zzclVar = new zzcl();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int i2 = 6;
            char c = 65535;
            int i3 = 3;
            switch (nextName.hashCode()) {
                case -2001388947:
                    if (nextName.equals("consent_signal")) {
                        z = false;
                        break;
                    }
                    z = true;
                    break;
                case -1938755376:
                    if (nextName.equals("error_message")) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                case -1851537225:
                    if (nextName.equals("consent_form_base_url")) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                case -1324537865:
                    if (nextName.equals("privacy_options_required")) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                case -1161803523:
                    if (nextName.equals(C3771Nr1.A.y)) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                case -986806987:
                    if (nextName.equals("request_info_keys")) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                case -790907624:
                    if (nextName.equals("consent_form_payload")) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                default:
                    z = true;
                    break;
            }
            switch (z) {
                case false:
                    String nextString = jsonReader.nextString();
                    switch (nextString.hashCode()) {
                        case -2058725357:
                            if (nextString.equals("CONSENT_SIGNAL_COLLECT_CONSENT")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -1969035850:
                            if (nextString.equals("CONSENT_SIGNAL_ERROR")) {
                                c = 6;
                                break;
                            }
                            break;
                        case -1263695752:
                            if (nextString.equals("CONSENT_SIGNAL_UNKNOWN")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -954325659:
                            if (nextString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -918677260:
                            if (nextString.equals("CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION")) {
                                c = 7;
                                break;
                            }
                            break;
                        case 429411856:
                            if (nextString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 467888915:
                            if (nextString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1725474845:
                            if (nextString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                                c = 5;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            i2 = 1;
                            break;
                        case 1:
                            i2 = 2;
                            break;
                        case 2:
                            i2 = 3;
                            break;
                        case 3:
                            i2 = 4;
                            break;
                        case 4:
                            i2 = 5;
                            break;
                        case 5:
                            break;
                        case 6:
                            i2 = 7;
                            break;
                        case 7:
                            i2 = 8;
                            break;
                        default:
                            throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                    }
                    zzclVar.f = i2;
                    break;
                case true:
                    zzclVar.a = jsonReader.nextString();
                    break;
                case true:
                    zzclVar.b = jsonReader.nextString();
                    break;
                case true:
                    zzclVar.c = jsonReader.nextString();
                    break;
                case true:
                    zzclVar.d = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzclVar.d.add(jsonReader.nextString());
                    }
                    jsonReader.endArray();
                    break;
                case true:
                    zzclVar.e = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzck zzckVar = new zzck();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            int hashCode = nextName2.hashCode();
                            if (hashCode != -2105551094) {
                                if (hashCode == 1583758243 && nextName2.equals(C9642t32.b)) {
                                    z2 = false;
                                }
                                z2 = true;
                            } else {
                                if (nextName2.equals("args_json")) {
                                    z2 = true;
                                }
                                z2 = true;
                            }
                            if (z2) {
                                if (!z2) {
                                    jsonReader.skipValue();
                                } else {
                                    zzckVar.a = jsonReader.nextString();
                                }
                            } else {
                                String nextString2 = jsonReader.nextString();
                                int hashCode2 = nextString2.hashCode();
                                if (hashCode2 != 64208429) {
                                    if (hashCode2 != 82862015) {
                                        if (hashCode2 == 1856333582 && nextString2.equals("UNKNOWN_ACTION_TYPE")) {
                                            z3 = false;
                                            if (!z3) {
                                                if (!z3) {
                                                    if (z3) {
                                                        i = 3;
                                                    } else {
                                                        throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(nextString2));
                                                    }
                                                } else {
                                                    i = 2;
                                                }
                                            } else {
                                                i = 1;
                                            }
                                            zzckVar.b = i;
                                        }
                                        z3 = true;
                                        if (!z3) {
                                        }
                                        zzckVar.b = i;
                                    } else {
                                        if (nextString2.equals("WRITE")) {
                                            z3 = true;
                                            if (!z3) {
                                            }
                                            zzckVar.b = i;
                                        }
                                        z3 = true;
                                        if (!z3) {
                                        }
                                        zzckVar.b = i;
                                    }
                                } else {
                                    if (nextString2.equals("CLEAR")) {
                                        z3 = true;
                                        if (!z3) {
                                        }
                                        zzckVar.b = i;
                                    }
                                    z3 = true;
                                    if (!z3) {
                                    }
                                    zzckVar.b = i;
                                }
                            }
                        }
                        jsonReader.endObject();
                        zzclVar.e.add(zzckVar);
                    }
                    jsonReader.endArray();
                    break;
                case true:
                    String nextString3 = jsonReader.nextString();
                    int hashCode3 = nextString3.hashCode();
                    if (hashCode3 != -1888946261) {
                        if (hashCode3 != 389487519) {
                            if (hashCode3 == 433141802 && nextString3.equals("UNKNOWN")) {
                                c = 0;
                            }
                        } else if (nextString3.equals("REQUIRED")) {
                            c = 1;
                        }
                    } else if (nextString3.equals("NOT_REQUIRED")) {
                        c = 2;
                    }
                    if (c != 0) {
                        if (c != 1) {
                            if (c != 2) {
                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(nextString3));
                            }
                        } else {
                            i3 = 2;
                        }
                    } else {
                        i3 = 1;
                    }
                    zzclVar.g = i3;
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return zzclVar;
    }
}
