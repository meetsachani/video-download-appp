package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.C3307Iz;
import o.C4715Xk;
import o.C4731Xo;
import o.C8077mf;
import o.ED2;
import o.EF0;

/* renamed from: com.facebook.ads.redexgen.X.Sy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1080Sy {
    public static byte[] A03;
    public static String[] A04 = {"hUOGynEtmSUNsKdJkghkOGNAWtryygzy", "wzPRxUupX2XKUl6NSNI9kT750batbohw", "Jhw1FAiFO5yEDnp58HFyVFkAnHcYvwe5", "TOMeOtqGrF4uQ0cY9hasq1ESWlFY5vR9", "yYpnUvpVzVqKhRvrciBHRtLUwNGFzaUs", "hHaB", "31TBXmQRr4tlfWcucEg5Ko3P35yO7", "Q2"};
    public static final String A05;
    public static volatile C1080Sy A06;
    public final C1669ge A00;
    public final Map<String, C1077Sv> A02 = Collections.synchronizedMap(new HashMap());
    public final Map<String, Float> A01 = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private Bitmap A02(T8 t8, C1077Sv c1077Sv, String str) {
        Bitmap A01;
        String str2 = c1077Sv.A08;
        int i = c1077Sv.A04;
        int i2 = c1077Sv.A05;
        long currentTimeMillis = System.currentTimeMillis();
        IOException e = null;
        String A08 = A08(223, 9, 68);
        boolean startsWith = str2.startsWith(A08);
        String A082 = A08(239, 22, 119);
        if (startsWith || str2.startsWith(A082)) {
            String substring = str2.startsWith(A08) ? str2.substring(A08.length()) : str2.substring(A082.length());
            InputStream inputStream = null;
            try {
                try {
                    inputStream = this.A00.getAssets().open(substring);
                    if (A0D(i, i2)) {
                        try {
                            A01 = T2.A01(inputStream, i, i2);
                        } catch (IOException e2) {
                            e = e2;
                            A0C(e);
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            return null;
                        } catch (OutOfMemoryError e3) {
                            e = e3;
                            A0C(e);
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            throw th;
                        }
                    } else {
                        A01 = BitmapFactory.decodeStream(inputStream);
                    }
                    if (inputStream != null) {
                        A0A(inputStream);
                    }
                } catch (IOException e4) {
                    e = e4;
                } catch (OutOfMemoryError e5) {
                    e = e5;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else if (A0D(i, i2)) {
            try {
                A01 = A05(str2, i, i2);
            } catch (IOException e6) {
                e = e6;
                A0C(e);
                A01 = A03(str2);
            }
        } else {
            A01 = A03(str2);
        }
        String th4 = e != null ? e.toString() : null;
        if (A01 == null) {
            T0.A03(t8, c1077Sv, str, T0.A03, th4, null, null);
            return null;
        }
        long A00 = A00(str2, A01);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (A00 > 0) {
            T0.A03(t8, c1077Sv, str, T0.A02, th4, Long.valueOf(A00), Long.valueOf(currentTimeMillis2));
            return A01;
        }
        T0.A03(t8, c1077Sv, str, T0.A01, th4, null, null);
        if (C1123Up.A11(t8)) {
            return null;
        }
        return A01;
    }

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 67);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A03 = new byte[]{3, 4, 119, C3307Iz.a0, 55, 62, 58, C8077mf.C, 28, 88, C8077mf.A, 13, C8077mf.n, 8, 13, C8077mf.n, 88, 28, C8077mf.G, C8077mf.m, C8077mf.n, 17, C8077mf.z, C8077mf.C, C8077mf.n, 17, C8077mf.A, C8077mf.z, 88, 80, C8077mf.H, 17, C8077mf.x, C8077mf.G, 69, 122, 81, 76, 85, 89, 72, C8077mf.B, 75, 81, 66, 93, C8077mf.B, 93, 64, 91, 93, 93, 92, 75, C8077mf.B, 85, 89, 64, C8077mf.B, 75, 81, 66, 93, C8077mf.B, 94, 87, 74, C8077mf.B, 75, 76, 87, 74, 89, 95, 93, 2, C8077mf.B, C8077mf.u, 48, 50, 57, 52, 113, 52, 35, 35, 62, 35, Byte.MAX_VALUE, 113, 19, 56, C3307Iz.X, 60, 48, C3307Iz.V, 113, 56, 34, 113, ED2.a, 36, C4715Xk.i, C4715Xk.i, Byte.MAX_VALUE, 125, 90, 82, 87, 94, 95, C8077mf.E, 79, 84, C8077mf.E, 88, 84, 75, 66, C8077mf.E, 87, 84, 88, 90, 87, C8077mf.E, 82, 86, 90, 92, 94, C8077mf.E, 82, 85, 79, 84, C8077mf.E, 88, 90, 88, 83, 94, C8077mf.E, 19, 78, 73, 87, 6, C3307Iz.Y, C8077mf.G, C8077mf.u, 17, 31, C8077mf.z, 83, 7, 28, 83, 4, 1, C8077mf.D, 7, C8077mf.z, 83, 17, C8077mf.D, 7, C8077mf.H, C8077mf.u, 3, 83, 7, 28, 83, C8077mf.y, C8077mf.D, 31, C8077mf.z, 83, 91, 6, 1, 31, 78, 70, 125, 114, 113, Byte.MAX_VALUE, 118, 51, 103, 124, 51, 100, 97, 122, 103, 118, 51, 113, 122, 103, 126, 114, 99, 51, 103, 124, 51, 124, 102, 103, 99, 102, 103, 51, 96, 103, 97, 118, 114, 126, 102, 116, 116, 98, 115, C4715Xk.i, 40, 40, 40, 85, 90, 95, 86, 9, 28, 28, 82, 93, 88, 81, C8077mf.p, C8077mf.E, C8077mf.E, C8077mf.E, 85, 90, 80, 70, 91, 93, 80, 107, 85, 71, 71, 81, 64, C8077mf.E, 115, 119, 123, 125, Byte.MAX_VALUE, 10, 9, 7, 2, 42, 49, 52, 49, 48, 40, 49};
    }

    static {
        A09();
        A05 = C1080Sy.class.getSimpleName();
    }

    public C1080Sy(C1669ge c1669ge) {
        this.A00 = c1669ge;
    }

    private int A00(String str, Bitmap bitmap) {
        String A08 = A08(0, 2, 105);
        if (bitmap == null) {
            A0C(null);
            return 0;
        }
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        ByteArrayOutputStream bOut = null;
        FileOutputStream fileOutputStream = null;
        try {
            bOut = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, bOut);
            int size = bOut.size();
            if (size >= C1123Up.A0H(this.A00)) {
                A0C(new Throwable(A08(35, 42, 123) + size));
                return 0;
            }
            fileOutputStream = new FileOutputStream(file);
            bOut.writeTo(fileOutputStream);
            fileOutputStream.flush();
            return size;
        } catch (OutOfMemoryError e) {
            A0C(e);
            Log.e(A05, A08(EF0.t, 39, 80), e);
            return 0;
        } catch (FileNotFoundException e2) {
            Log.e(A05, A08(6, 29, 59) + file.getPath() + A08, e2);
            A0C(e2);
            return 0;
        } catch (IOException e3) {
            A0C(e3);
            Log.e(A05, A08(o.DE.g, 36, 48) + str + A08, e3);
            return 0;
        } finally {
            A0A(bOut);
            A0A(fileOutputStream);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Bitmap A01(T8 t8, C1077Sv c1077Sv, int i, int i2, String str) {
        Bitmap decodeFile;
        Bitmap A02;
        if (T0.A06(t8) && A08(266, 4, 37).equals(str)) {
            this.A02.put(c1077Sv.A08, c1077Sv);
        }
        String str2 = c1077Sv.A08;
        C1081Sz c1081Sz = new C1081Sz(c1077Sv.A06, c1077Sv.A07, A08(261, 5, 89), str, str2);
        File A07 = A07(this.A00);
        StringBuilder append = new StringBuilder().append(str2.hashCode());
        String url = A08(2, 4, 26);
        File file = new File(A07, append.append(url).toString());
        if (!file.exists()) {
            T0.A04(t8, c1081Sz, false);
            String url2 = A08(232, 7, 112);
            if (str2.startsWith(url2)) {
                if (A04[4].charAt(22) == 'U') {
                    throw new RuntimeException();
                }
                A04[4] = "1yvOkimt2rWPU4mmWW1HHQmjZRsiMbmk";
                String url3 = A08(239, 22, 119);
                if (!str2.startsWith(url3)) {
                    A02 = A04(str2, i2, i);
                    String str3 = c1077Sv.A08;
                    if (A04[0].charAt(7) == 'l') {
                        A04[5] = "mvVz";
                        A0B(str3, A02);
                        return A02;
                    }
                    A04[4] = "ZqrwEo7e3gbOTkHDiv52cvZJTxj52IUd";
                    A0B(str3, A02);
                    return A02;
                }
            }
            A02 = A02(t8, c1077Sv, str);
            String str32 = c1077Sv.A08;
            if (A04[0].charAt(7) == 'l') {
            }
        } else {
            T0.A04(t8, c1081Sz, true);
            try {
                if (A0D(i2, i)) {
                    decodeFile = T2.A02(file.getCanonicalPath(), i2, i, this.A00);
                } else {
                    String url4 = file.getCanonicalPath();
                    decodeFile = BitmapFactory.decodeFile(url4);
                }
                String url5 = c1077Sv.A08;
                A0B(url5, decodeFile);
                return decodeFile;
            } catch (IOException e) {
                A0C(e);
                return null;
            }
        }
    }

    private Bitmap A03(String str) {
        byte[] A72;
        InterfaceC1623fu AGw = C1642gD.A00(this.A00).AGw(str, new C1638g9());
        if (AGw == null || (A72 = AGw.A72()) == null) {
            return null;
        }
        int length = A72.length;
        if (A04[4].charAt(22) != 'U') {
            A04[2] = "99IwdndnBnCK07hgvsXqxjXsnHcettbD";
            return BitmapFactory.decodeByteArray(A72, 0, length);
        }
        throw new RuntimeException();
    }

    private Bitmap A04(String str, int i, int i2) {
        Bitmap decodeStream;
        int A00;
        try {
            boolean A0D = A0D(i, i2);
            String A08 = A08(232, 7, 112);
            if (A0D) {
                decodeStream = T2.A02(str.substring(A08.length()), i, i2, this.A00);
            } else {
                decodeStream = BitmapFactory.decodeStream(new FileInputStream(str.substring(A08.length())), null, null);
            }
            A00 = A00(str, decodeStream);
        } catch (IOException e) {
            Log.e(A05, A08(105, 43, 120) + str + A08(0, 2, 105), e);
        }
        if (C1123Up.A11(this.A00)) {
            if (A00 <= 0) {
                return null;
            }
            return decodeStream;
        }
        return decodeStream;
    }

    private Bitmap A05(String str, int i, int i2) throws IOException {
        URL urlObj = new URL(str);
        HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
        connection.setDoInput(true);
        connection.connect();
        InputStream inputStream = connection.getInputStream();
        Bitmap A01 = T2.A01(inputStream, i, i2);
        A0A(inputStream);
        return A01;
    }

    public static C1080Sy A06(C1669ge c1669ge) {
        if (A06 == null) {
            synchronized (C1080Sy.class) {
                if (A06 == null) {
                    A06 = new C1080Sy(c1669ge);
                }
            }
        }
        return A06;
    }

    public static File A07(T8 t8) {
        return t8.getCacheDir();
    }

    public static void A0A(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private void A0B(String str, Bitmap bitmap) {
        if (!this.A01.containsKey(str) && bitmap != null && bitmap.getHeight() > 0) {
            float width = bitmap.getWidth() / bitmap.getHeight();
            if (width > 0.0f) {
                this.A01.put(str, Float.valueOf(width));
            }
        }
    }

    private void A0C(Throwable th) {
        String A08 = A08(261, 5, 89);
        if (th != null) {
            this.A00.A08().ABC(A08, AbstractC1085Td.A1f, new C1086Te(th));
        } else {
            this.A00.A08().ABC(A08, AbstractC1085Td.A1f, new C1086Te(A08(77, 28, 18)));
        }
    }

    private boolean A0D(int i, int i2) {
        return i > 0 && i2 > 0;
    }

    public final float A0E(String str) {
        if (!this.A01.containsKey(str) || this.A01.get(str) == null) {
            if (A04[6].length() != 28) {
                A04[6] = "EtgkjkQAQYyyMgrrXA05VcKpExUV0Ywa";
                return -1.0f;
            }
            throw new RuntimeException();
        }
        return this.A01.get(str).floatValue();
    }

    public final Bitmap A0F(C1077Sv c1077Sv) {
        return A01(this.A00, c1077Sv, c1077Sv.A05, c1077Sv.A04, c1077Sv.A02);
    }

    public final Bitmap A0G(T8 t8, String str, int i, int i2, String str2) {
        C1077Sv c1077Sv = this.A02.get(str);
        return (!T0.A06(t8) || c1077Sv == null) ? A01(t8, new C1077Sv(str, i, i2, A08(C4731Xo.d1, 7, 28), A08(C4731Xo.d1, 7, 28)), i2, i, str2) : A01(t8, c1077Sv, i2, i, str2);
    }

    public final File A0H(String str) {
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public final String A0I(String str) {
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        return file.exists() ? file.getPath() : str;
    }
}
