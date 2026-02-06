package o;

import android.util.Patterns;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.Hn0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3167Hn0 {
    @NotNull
    public static final C3167Hn0 a = new C3167Hn0();
    public static final int b = 30;
    @NotNull
    public static final String c = "password";
    @NotNull
    public static final String d = "(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)";
    @NotNull
    public static final String e = "(?i)(sign in)|login|signIn";
    @NotNull
    public static final String f = "(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)";
    @NotNull
    public static final String g = "(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart";
    @NotNull
    public static final String h = "(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy";
    public static Map<String, String> i;
    public static Map<String, String> j;
    public static Map<String, String> k;
    public static JSONObject l;
    public static boolean m;

    @InterfaceC9511sW0
    @Nullable
    public static final float[] a(@NotNull JSONObject jSONObject, @NotNull String str) {
        String lowerCase;
        JSONObject jSONObject2;
        String optString;
        JSONArray jSONArray;
        C3167Hn0 c3167Hn0;
        JSONObject b2;
        if (SQ.e(C3167Hn0.class)) {
            return null;
        }
        try {
            C6562gT0.p(jSONObject, "viewHierarchy");
            C6562gT0.p(str, "appName");
            if (!m) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i2 = 0; i2 < 30; i2++) {
                fArr[i2] = 0.0f;
            }
            try {
                lowerCase = str.toLowerCase();
                C6562gT0.o(lowerCase, "(this as java.lang.String).toLowerCase()");
                jSONObject2 = new JSONObject(jSONObject.optJSONObject(C9698tH2.A).toString());
                optString = jSONObject.optString(C9698tH2.z);
                jSONArray = new JSONArray();
                c3167Hn0 = a;
                c3167Hn0.j(jSONObject2, jSONArray);
                c3167Hn0.m(fArr, c3167Hn0.i(jSONObject2));
                b2 = c3167Hn0.b(jSONObject2);
            } catch (JSONException unused) {
            }
            if (b2 == null) {
                return null;
            }
            C6562gT0.o(optString, "screenName");
            String jSONObject3 = jSONObject2.toString();
            C6562gT0.o(jSONObject3, "viewTree.toString()");
            c3167Hn0.m(fArr, c3167Hn0.h(b2, jSONArray, optString, jSONObject3, lowerCase));
            return fArr;
        } catch (Throwable th) {
            SQ.c(th, C3167Hn0.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String c(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        if (SQ.e(C3167Hn0.class)) {
            return null;
        }
        try {
            C6562gT0.p(str, "buttonText");
            C6562gT0.p(str2, "activityName");
            C6562gT0.p(str3, "appName");
            String str4 = str3 + " | " + str2 + C6566gU0.h + str;
            if (str4 != null) {
                String lowerCase = str4.toLowerCase();
                C6562gT0.o(lowerCase, "(this as java.lang.String).toLowerCase()");
                return lowerCase;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th) {
            SQ.c(th, C3167Hn0.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    public static final void d(@Nullable File file) {
        if (!SQ.e(C3167Hn0.class)) {
            try {
                try {
                    l = new JSONObject();
                    FileInputStream fileInputStream = new FileInputStream(file);
                    byte[] bArr = new byte[fileInputStream.available()];
                    fileInputStream.read(bArr);
                    fileInputStream.close();
                    l = new JSONObject(new String(bArr, HB.b));
                    i = C8926q81.W(C6670gv2.a(C9698tH2.B, "1"), C6670gv2.a(C9698tH2.C, C2638Cg0.Y4), C6670gv2.a(C9698tH2.D, C2638Cg0.Z4), C6670gv2.a(C9698tH2.E, "4"));
                    j = C8926q81.W(C6670gv2.a(C9698tH2.F, "0"), C6670gv2.a(C9698tH2.G, "1"), C6670gv2.a(C9698tH2.H, C2638Cg0.Y4), C6670gv2.a(C9698tH2.I, C2638Cg0.Z4), C6670gv2.a(C9698tH2.J, "4"), C6670gv2.a(C9698tH2.K, "5"), C6670gv2.a(C9698tH2.L, "6"), C6670gv2.a(C9698tH2.M, "7"), C6670gv2.a(C9698tH2.N, "8"));
                    k = C8926q81.W(C6670gv2.a(C9698tH2.O, "1"), C6670gv2.a(C9698tH2.P, C2638Cg0.Y4), C6670gv2.a(C9698tH2.Q, C2638Cg0.Z4), C6670gv2.a(C9698tH2.R, "4"));
                    m = true;
                } catch (Throwable th) {
                    SQ.c(th, C3167Hn0.class);
                }
            } catch (Exception unused) {
            }
        }
    }

    @InterfaceC9511sW0
    public static final boolean f() {
        if (SQ.e(C3167Hn0.class)) {
            return false;
        }
        try {
            return m;
        } catch (Throwable th) {
            SQ.c(th, C3167Hn0.class);
            return false;
        }
    }

    public final JSONObject b(JSONObject jSONObject) {
        int length;
        if (SQ.e(this)) {
            return null;
        }
        try {
        } catch (JSONException unused) {
        } catch (Throwable th) {
            SQ.c(th, this);
        }
        if (jSONObject.optBoolean(C9698tH2.y)) {
            return jSONObject;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(C9698tH2.j);
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                C6562gT0.o(jSONObject2, "children.getJSONObject(i)");
                JSONObject b2 = b(jSONObject2);
                if (b2 != null) {
                    return b2;
                }
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        return null;
    }

    public final boolean e(JSONObject jSONObject) {
        if (SQ.e(this)) {
            return false;
        }
        try {
            if (((jSONObject.optInt(C9698tH2.d) & 1) << 5) <= 0) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }

    public final boolean g(String[] strArr, String[] strArr2) {
        if (SQ.e(this)) {
            return false;
        }
        try {
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                String str = strArr[i2];
                i2++;
                int length2 = strArr2.length;
                int i3 = 0;
                while (i3 < length2) {
                    String str2 = strArr2[i3];
                    i3++;
                    if (C10763xf2.n3(str2, str, false, 2, null)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float[] h(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        float f2;
        float f3;
        String str4;
        String sb;
        String sb2;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int length;
        if (SQ.e(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i2 = 0; i2 < 30; i2++) {
                fArr[i2] = 0.0f;
            }
            int length2 = jSONArray.length();
            float f17 = 1.0f;
            if (length2 > 1) {
                f2 = length2 - 1.0f;
            } else {
                f2 = 0.0f;
            }
            fArr[3] = f2;
            try {
                length = jSONArray.length();
            } catch (JSONException unused) {
            }
            if (length > 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                    f3 = f17;
                    try {
                        C6562gT0.o(jSONObject2, "siblings.getJSONObject(i)");
                        if (e(jSONObject2)) {
                            fArr[9] = fArr[9] + f3;
                        }
                        if (i4 >= length) {
                            break;
                        }
                        i3 = i4;
                        f17 = f3;
                    } catch (JSONException unused2) {
                    }
                }
                fArr[13] = -1.0f;
                fArr[14] = -1.0f;
                str4 = str + '|' + str3;
                StringBuilder sb3 = new StringBuilder();
                StringBuilder sb4 = new StringBuilder();
                n(jSONObject, sb4, sb3);
                sb = sb3.toString();
                C6562gT0.o(sb, "hintSB.toString()");
                sb2 = sb4.toString();
                C6562gT0.o(sb2, "textSB.toString()");
                if (!l(C9698tH2.B, C9698tH2.N, C9698tH2.O, sb2)) {
                    f4 = f3;
                } else {
                    f4 = 0.0f;
                }
                fArr[15] = f4;
                if (!l(C9698tH2.B, C9698tH2.N, C9698tH2.P, str4)) {
                    f5 = f3;
                } else {
                    f5 = 0.0f;
                }
                fArr[16] = f5;
                if (!l(C9698tH2.B, C9698tH2.N, C9698tH2.R, sb)) {
                    f6 = f3;
                } else {
                    f6 = 0.0f;
                }
                fArr[17] = f6;
                if (!C10763xf2.n3(str2, c, false, 2, null)) {
                    f7 = f3;
                } else {
                    f7 = 0.0f;
                }
                fArr[18] = f7;
                if (!k(d, str2)) {
                    f8 = f3;
                } else {
                    f8 = 0.0f;
                }
                fArr[19] = f8;
                if (!k(e, str2)) {
                    f9 = f3;
                } else {
                    f9 = 0.0f;
                }
                fArr[20] = f9;
                if (!k(f, str2)) {
                    f10 = f3;
                } else {
                    f10 = 0.0f;
                }
                fArr[21] = f10;
                if (!l(C9698tH2.B, C9698tH2.L, C9698tH2.O, sb2)) {
                    f11 = f3;
                } else {
                    f11 = 0.0f;
                }
                fArr[22] = f11;
                if (!l(C9698tH2.B, C9698tH2.L, C9698tH2.P, str4)) {
                    f12 = f3;
                } else {
                    f12 = 0.0f;
                }
                fArr[24] = f12;
                if (!k(g, sb2)) {
                    f13 = f3;
                } else {
                    f13 = 0.0f;
                }
                fArr[25] = f13;
                if (!k(h, str4)) {
                    f14 = f3;
                } else {
                    f14 = 0.0f;
                }
                fArr[27] = f14;
                if (!l(C9698tH2.B, C9698tH2.M, C9698tH2.O, sb2)) {
                    f15 = f3;
                } else {
                    f15 = 0.0f;
                }
                fArr[28] = f15;
                if (!l(C9698tH2.B, C9698tH2.M, C9698tH2.P, str4)) {
                    f16 = f3;
                } else {
                    f16 = 0.0f;
                }
                fArr[29] = f16;
                return fArr;
            }
            f3 = f17;
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            str4 = str + '|' + str3;
            StringBuilder sb32 = new StringBuilder();
            StringBuilder sb42 = new StringBuilder();
            n(jSONObject, sb42, sb32);
            sb = sb32.toString();
            C6562gT0.o(sb, "hintSB.toString()");
            sb2 = sb42.toString();
            C6562gT0.o(sb2, "textSB.toString()");
            if (!l(C9698tH2.B, C9698tH2.N, C9698tH2.O, sb2)) {
            }
            fArr[15] = f4;
            if (!l(C9698tH2.B, C9698tH2.N, C9698tH2.P, str4)) {
            }
            fArr[16] = f5;
            if (!l(C9698tH2.B, C9698tH2.N, C9698tH2.R, sb)) {
            }
            fArr[17] = f6;
            if (!C10763xf2.n3(str2, c, false, 2, null)) {
            }
            fArr[18] = f7;
            if (!k(d, str2)) {
            }
            fArr[19] = f8;
            if (!k(e, str2)) {
            }
            fArr[20] = f9;
            if (!k(f, str2)) {
            }
            fArr[21] = f10;
            if (!l(C9698tH2.B, C9698tH2.L, C9698tH2.O, sb2)) {
            }
            fArr[22] = f11;
            if (!l(C9698tH2.B, C9698tH2.L, C9698tH2.P, str4)) {
            }
            fArr[24] = f12;
            if (!k(g, sb2)) {
            }
            fArr[25] = f13;
            if (!k(h, str4)) {
            }
            fArr[27] = f14;
            if (!l(C9698tH2.B, C9698tH2.M, C9698tH2.O, sb2)) {
            }
            fArr[28] = f15;
            if (!l(C9698tH2.B, C9698tH2.M, C9698tH2.P, str4)) {
            }
            fArr[29] = f16;
            return fArr;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final float[] i(JSONObject jSONObject) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            int i2 = 0;
            for (int i3 = 0; i3 < 30; i3++) {
                fArr[i3] = 0.0f;
            }
            String optString = jSONObject.optString("text");
            C6562gT0.o(optString, "node.optString(TEXT_KEY)");
            String lowerCase = optString.toLowerCase();
            C6562gT0.o(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint");
            C6562gT0.o(optString2, "node.optString(HINT_KEY)");
            String lowerCase2 = optString2.toLowerCase();
            C6562gT0.o(lowerCase2, "(this as java.lang.String).toLowerCase()");
            String optString3 = jSONObject.optString(C9698tH2.c);
            C6562gT0.o(optString3, "node.optString(CLASS_NAME_KEY)");
            String lowerCase3 = optString3.toLowerCase();
            C6562gT0.o(lowerCase3, "(this as java.lang.String).toLowerCase()");
            int optInt = jSONObject.optInt(C9698tH2.x, -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (g(new String[]{"$", "amount", FirebaseAnalytics.Param.B, "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (g(new String[]{c, "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (g(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (g(new String[]{"search"}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (optInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (optInt == 3 || optInt == 2) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (C10763xf2.n3(lowerCase3, "checkbox", false, 2, null)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (g(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (C10763xf2.n3(lowerCase3, "radio", false, 2, null) && C10763xf2.n3(lowerCase3, "button", false, 2, null)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray(C9698tH2.j);
                int length = optJSONArray.length();
                if (length > 0) {
                    while (true) {
                        int i4 = i2 + 1;
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                        C6562gT0.o(jSONObject2, "childViews.getJSONObject(i)");
                        m(fArr, i(jSONObject2));
                        if (i4 >= length) {
                            break;
                        }
                        i2 = i4;
                    }
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final boolean j(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z;
        if (SQ.e(this)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean(C9698tH2.y)) {
                return true;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray(C9698tH2.j);
            int length = optJSONArray.length();
            if (length > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    if (optJSONArray.getJSONObject(i2).optBoolean(C9698tH2.y)) {
                        z = true;
                        break;
                    } else if (i3 >= length) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
            }
            z = false;
            boolean z2 = z;
            JSONArray jSONArray2 = new JSONArray();
            if (z) {
                int length2 = optJSONArray.length();
                if (length2 > 0) {
                    int i4 = 0;
                    while (true) {
                        int i5 = i4 + 1;
                        jSONArray.put(optJSONArray.getJSONObject(i4));
                        if (i5 >= length2) {
                            break;
                        }
                        i4 = i5;
                    }
                }
                return z2;
            }
            int length3 = optJSONArray.length();
            if (length3 > 0) {
                int i6 = 0;
                while (true) {
                    int i7 = i6 + 1;
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i6);
                    C6562gT0.o(jSONObject2, "child");
                    if (j(jSONObject2, jSONArray)) {
                        jSONArray2.put(jSONObject2);
                        z2 = true;
                    }
                    if (i7 >= length3) {
                        break;
                    }
                    i6 = i7;
                }
            }
            jSONObject.put(C9698tH2.j, jSONArray2);
            return z2;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }

    public final boolean k(String str, String str2) {
        if (SQ.e(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0050 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:5:0x0008, B:7:0x000d, B:31:0x005d, B:23:0x0043, B:26:0x004c, B:28:0x0050, B:35:0x0064, B:36:0x0069, B:15:0x0029, B:18:0x0032, B:20:0x0036, B:37:0x006a, B:38:0x006f, B:10:0x0017, B:12:0x001b, B:39:0x0070, B:40:0x0075, B:41:0x0076, B:42:0x007b), top: B:45:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:5:0x0008, B:7:0x000d, B:31:0x005d, B:23:0x0043, B:26:0x004c, B:28:0x0050, B:35:0x0064, B:36:0x0069, B:15:0x0029, B:18:0x0032, B:20:0x0036, B:37:0x006a, B:38:0x006f, B:10:0x0017, B:12:0x001b, B:39:0x0070, B:40:0x0075, B:41:0x0076, B:42:0x007b), top: B:45:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:5:0x0008, B:7:0x000d, B:31:0x005d, B:23:0x0043, B:26:0x004c, B:28:0x0050, B:35:0x0064, B:36:0x0069, B:15:0x0029, B:18:0x0032, B:20:0x0036, B:37:0x006a, B:38:0x006f, B:10:0x0017, B:12:0x001b, B:39:0x0070, B:40:0x0075, B:41:0x0076, B:42:0x007b), top: B:45:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(String str, String str2, String str3, String str4) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4;
        Map<String, String> map;
        if (SQ.e(this)) {
            return false;
        }
        try {
            JSONObject jSONObject = l;
            String str5 = null;
            if (jSONObject != null) {
                JSONObject optJSONObject5 = jSONObject.optJSONObject("rulesForLanguage");
                if (optJSONObject5 == null) {
                    optJSONObject = null;
                } else {
                    Map<String, String> map2 = i;
                    if (map2 != null) {
                        optJSONObject = optJSONObject5.optJSONObject(map2.get(str));
                    } else {
                        C6562gT0.S("languageInfo");
                        throw null;
                    }
                }
                if (optJSONObject != null && (optJSONObject2 = optJSONObject.optJSONObject("rulesForEvent")) != null) {
                    Map<String, String> map3 = j;
                    if (map3 != null) {
                        optJSONObject3 = optJSONObject2.optJSONObject(map3.get(str2));
                        if (optJSONObject3 != null && (optJSONObject4 = optJSONObject3.optJSONObject("positiveRules")) != null) {
                            map = k;
                            if (map == null) {
                                str5 = optJSONObject4.optString(map.get(str3));
                            } else {
                                C6562gT0.S("textTypeInfo");
                                throw null;
                            }
                        }
                        if (str5 != null) {
                            return false;
                        }
                        return k(str5, str4);
                    }
                    C6562gT0.S("eventInfo");
                    throw null;
                }
                optJSONObject3 = null;
                if (optJSONObject3 != null) {
                    map = k;
                    if (map == null) {
                    }
                }
                if (str5 != null) {
                }
            } else {
                C6562gT0.S("rules");
                throw null;
            }
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }

    public final void m(float[] fArr, float[] fArr2) {
        if (!SQ.e(this)) {
            try {
                int length = fArr.length - 1;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        fArr[i2] = fArr[i2] + fArr2[i2];
                        if (i3 <= length) {
                            i2 = i3;
                        } else {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void n(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        int length;
        if (!SQ.e(this)) {
            try {
                String optString = jSONObject.optString("text", "");
                C6562gT0.o(optString, "view.optString(TEXT_KEY, \"\")");
                String lowerCase = optString.toLowerCase();
                C6562gT0.o(lowerCase, "(this as java.lang.String).toLowerCase()");
                String optString2 = jSONObject.optString("hint", "");
                C6562gT0.o(optString2, "view.optString(HINT_KEY, \"\")");
                String lowerCase2 = optString2.toLowerCase();
                C6562gT0.o(lowerCase2, "(this as java.lang.String).toLowerCase()");
                if (lowerCase.length() > 0) {
                    sb.append(lowerCase);
                    sb.append(C4500Ve2.b);
                }
                if (lowerCase2.length() > 0) {
                    sb2.append(lowerCase2);
                    sb2.append(C4500Ve2.b);
                }
                JSONArray optJSONArray = jSONObject.optJSONArray(C9698tH2.j);
                if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        try {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                            C6562gT0.o(jSONObject2, "currentChildView");
                            n(jSONObject2, sb, sb2);
                        } catch (JSONException unused) {
                        }
                        if (i3 < length) {
                            i2 = i3;
                        } else {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }
}
