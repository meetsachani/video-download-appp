package o;

import android.text.TextUtils;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import o.HT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@HT1({HT1.a.Y})
/* renamed from: o.fE2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6249fE2 {
    @NotNull
    public static final C6249fE2 a = new C6249fE2();
    @NotNull
    public static final String b = "facebook_ml/";

    @InterfaceC9511sW0
    @Nullable
    public static final File a() {
        if (SQ.e(C6249fE2.class)) {
            return null;
        }
        try {
            com.facebook.M m = com.facebook.M.a;
            File file = new File(com.facebook.M.n().getFilesDir(), b);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th) {
            SQ.c(th, C6249fE2.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Map<String, C6718h71> c(@NotNull File file) {
        Map<String, C6718h71> map;
        Map<String, C6718h71> map2 = null;
        if (SQ.e(C6249fE2.class)) {
            return null;
        }
        try {
            C6562gT0.p(file, "file");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                int available = fileInputStream.available();
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                byte[] bArr = new byte[available];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                if (available < 4) {
                    return null;
                }
                int i = 0;
                ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 4);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                int i2 = wrap.getInt();
                int i3 = i2 + 4;
                if (available < i3) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(new String(bArr, 4, i2, HB.b));
                JSONArray names = jSONObject.names();
                int length = names.length();
                String[] strArr = new String[length];
                int i4 = length - 1;
                if (i4 >= 0) {
                    int i5 = 0;
                    while (true) {
                        int i6 = i5 + 1;
                        strArr[i5] = names.getString(i5);
                        if (i6 > i4) {
                            break;
                        }
                        i5 = i6;
                    }
                }
                C4788Ye.U3(strArr);
                HashMap hashMap = new HashMap();
                int i7 = 0;
                while (i7 < length) {
                    String str = strArr[i7];
                    i7++;
                    if (str != null) {
                        JSONArray jSONArray = jSONObject.getJSONArray(str);
                        int length2 = jSONArray.length();
                        int[] iArr = new int[length2];
                        int i8 = length2 - 1;
                        int i9 = 1;
                        map = map2;
                        if (i8 >= 0) {
                            int i10 = i;
                            while (true) {
                                int i11 = i10 + 1;
                                try {
                                    int i12 = jSONArray.getInt(i10);
                                    iArr[i10] = i12;
                                    i9 *= i12;
                                    if (i11 > i8) {
                                        break;
                                    }
                                    i10 = i11;
                                } catch (Exception unused) {
                                    return map;
                                } catch (Throwable th) {
                                    th = th;
                                    SQ.c(th, C6249fE2.class);
                                    return map;
                                }
                            }
                        }
                        int i13 = i9 * 4;
                        int i14 = i3 + i13;
                        if (i14 > available) {
                            return map;
                        }
                        ByteBuffer wrap2 = ByteBuffer.wrap(bArr, i3, i13);
                        wrap2.order(ByteOrder.LITTLE_ENDIAN);
                        C6718h71 c6718h71 = new C6718h71(iArr);
                        wrap2.asFloatBuffer().get(c6718h71.a(), 0, i9);
                        hashMap.put(str, c6718h71);
                        i3 = i14;
                        i = 0;
                        map2 = map;
                    }
                }
                return hashMap;
            } catch (Exception unused2) {
                return map2;
            }
        } catch (Throwable th2) {
            th = th2;
            map = map2;
        }
    }

    @NotNull
    public final String b(@NotNull String str) {
        int i;
        boolean z;
        if (SQ.e(this)) {
            return null;
        }
        try {
            C6562gT0.p(str, "str");
            int length = str.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                if (!z2) {
                    i = i2;
                } else {
                    i = length;
                }
                if (C6562gT0.t(str.charAt(i), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z2) {
                    if (!z) {
                        z2 = true;
                    } else {
                        i2++;
                    }
                } else if (!z) {
                    break;
                } else {
                    length--;
                }
            }
            Object[] array = new C10219vQ1("\\s+").r(str.subSequence(i2, length + 1).toString(), 0).toArray(new String[0]);
            if (array != null) {
                String join = TextUtils.join(C4500Ve2.b, (String[]) array);
                C6562gT0.o(join, "join(\" \", strArray)");
                return join;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    @NotNull
    public final int[] d(@NotNull String str, int i) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            C6562gT0.p(str, "texts");
            int[] iArr = new int[i];
            String b2 = b(str);
            Charset forName = Charset.forName("UTF-8");
            C6562gT0.o(forName, "forName(\"UTF-8\")");
            if (b2 != null) {
                byte[] bytes = b2.getBytes(forName);
                C6562gT0.o(bytes, "(this as java.lang.String).getBytes(charset)");
                if (i > 0) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        if (i2 < bytes.length) {
                            iArr[i2] = bytes[i2] & 255;
                        } else {
                            iArr[i2] = 0;
                        }
                        if (i3 >= i) {
                            break;
                        }
                        i2 = i3;
                    }
                }
                return iArr;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }
}
