package o;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/* renamed from: o.bE2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5279bE2 {
    public static final int a = 10;

    /* renamed from: o.bE2$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ int X;
        public final /* synthetic */ String Y;

        public a(int i, String str) {
            this.X = i;
            this.Y = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            BI.d().b().remove(this.X);
            File file = new File(this.Y);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    /* renamed from: o.bE2$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ int X;

        public b(int i) {
            this.X = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<C5002a60> e = BI.d().b().e(this.X);
            if (e != null) {
                for (C5002a60 c5002a60 : e) {
                    String e2 = C5279bE2.e(c5002a60.a(), c5002a60.d());
                    BI.d().b().remove(c5002a60.e());
                    File file = new File(e2);
                    if (file.exists()) {
                        file.delete();
                    }
                }
            }
        }
    }

    public static void a(String str, int i) {
        SP.b().a().c().execute(new a(i, str));
    }

    public static void b(int i) {
        SP.b().a().c().execute(new b(i));
    }

    public static String c(String str, String str2) {
        return str + File.separator + str2;
    }

    public static InterfaceC9457sI0 d(InterfaceC9457sI0 interfaceC9457sI0, C5730d60 c5730d60) throws IOException, IllegalAccessException {
        int E0 = interfaceC9457sI0.E0();
        String Z0 = interfaceC9457sI0.Z0("Location");
        int i = 0;
        while (g(E0)) {
            if (Z0 != null) {
                interfaceC9457sI0.close();
                c5730d60.W(Z0);
                interfaceC9457sI0 = BI.d().c();
                interfaceC9457sI0.H0(c5730d60);
                E0 = interfaceC9457sI0.E0();
                Z0 = interfaceC9457sI0.Z0("Location");
                i++;
                if (i >= 10) {
                    throw new IllegalAccessException("Max redirection done");
                }
            } else {
                throw new IllegalAccessException("Location is null");
            }
        }
        return interfaceC9457sI0;
    }

    public static String e(String str, String str2) {
        return c(str, str2) + ".temp";
    }

    public static int f(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str4 = File.separator;
        sb.append(str4);
        sb.append(str2);
        sb.append(str4);
        sb.append(str3);
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(sb.toString().getBytes("UTF-8"));
            StringBuilder sb2 = new StringBuilder(digest.length * 2);
            for (byte b2 : digest) {
                int i = b2 & 255;
                if (i < 16) {
                    sb2.append("0");
                }
                sb2.append(Integer.toHexString(i));
            }
            return sb2.toString().hashCode();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UnsupportedEncodingException", e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("NoSuchAlgorithmException", e2);
        }
    }

    public static boolean g(int i) {
        if (i != 301 && i != 302 && i != 303 && i != 300 && i != 307 && i != 308) {
            return false;
        }
        return true;
    }

    public static void h(String str, String str2) throws IOException {
        File file = new File(str);
        try {
            File file2 = new File(str2);
            if (file2.exists() && !file2.delete()) {
                throw new IOException("Deletion Failed");
            }
            if (file.renameTo(file2)) {
                if (file.exists()) {
                    file.delete();
                    return;
                }
                return;
            }
            throw new IOException("Rename Failed");
        } catch (Throwable th) {
            if (file.exists()) {
                file.delete();
            }
            throw th;
        }
    }
}
