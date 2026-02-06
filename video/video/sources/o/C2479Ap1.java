package o;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: o.Ap1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2479Ap1 {
    public final A61 a;

    public C2479Ap1(A61 a61) {
        this.a = a61;
    }

    public static String c(String str, EnumC7614kp0 enumC7614kp0, boolean z) {
        String str2;
        if (z) {
            str2 = enumC7614kp0.g();
        } else {
            str2 = enumC7614kp0.X;
        }
        String replaceAll = str.replaceAll("\\W+", "");
        int length = 242 - str2.length();
        if (replaceAll.length() > length) {
            replaceAll = e(replaceAll, length);
        }
        return "lottie_cache_" + replaceAll + str2;
    }

    public static String e(String str, int i) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return str.substring(0, i);
        }
    }

    public void a() {
        File f = f();
        if (f.exists()) {
            File[] listFiles = f.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file : listFiles) {
                    file.delete();
                }
            }
            f.delete();
        }
    }

    public Pair<EnumC7614kp0, InputStream> b(String str) {
        EnumC7614kp0 enumC7614kp0;
        try {
            File d = d(str);
            if (d == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(d);
            if (d.getAbsolutePath().endsWith(".zip")) {
                enumC7614kp0 = EnumC7614kp0.ZIP;
            } else if (d.getAbsolutePath().endsWith(".gz")) {
                enumC7614kp0 = EnumC7614kp0.GZIP;
            } else {
                enumC7614kp0 = EnumC7614kp0.JSON;
            }
            C7190j41.a("Cache hit for " + str + " at " + d.getAbsolutePath());
            return new Pair<>(enumC7614kp0, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public final File d(String str) throws FileNotFoundException {
        File file = new File(f(), c(str, EnumC7614kp0.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(f(), c(str, EnumC7614kp0.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(f(), c(str, EnumC7614kp0.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    public final File f() {
        File a = this.a.a();
        if (a.isFile()) {
            a.delete();
        }
        if (!a.exists()) {
            a.mkdirs();
        }
        return a;
    }

    public void g(String str, EnumC7614kp0 enumC7614kp0) {
        File file = new File(f(), c(str, enumC7614kp0, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        C7190j41.a("Copying temp file to real file (" + file2 + C9811tl1.d);
        if (!renameTo) {
            C7190j41.e("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + UE.h);
        }
    }

    public File h(String str, InputStream inputStream, EnumC7614kp0 enumC7614kp0) throws IOException {
        File file = new File(f(), c(str, enumC7614kp0, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file;
                }
            }
        } finally {
            inputStream.close();
        }
    }
}
