package o;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: o.dg  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5867dg {
    public static final String d = "AtomicFile";
    public final File a;
    public final File b;
    public final File c;

    public C5867dg(File file) {
        this.a = file;
        this.b = new File(file.getPath() + ".new");
        this.c = new File(file.getPath() + ".bak");
    }

    public static void g(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }

    public static boolean i(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void a() {
        this.a.delete();
        this.b.delete();
        this.c.delete();
    }

    public void b(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            if (!i(fileOutputStream)) {
                Log.e("AtomicFile", "Failed to sync file output stream");
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                Log.e("AtomicFile", "Failed to close file output stream", e);
            }
            if (!this.b.delete()) {
                Log.e("AtomicFile", "Failed to delete new file " + this.b);
            }
        }
    }

    public void c(FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!i(fileOutputStream)) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            Log.e("AtomicFile", "Failed to close file output stream", e);
        }
        g(this.b, this.a);
    }

    public File d() {
        return this.a;
    }

    public FileInputStream e() throws FileNotFoundException {
        if (this.c.exists()) {
            g(this.c, this.a);
        }
        if (this.b.exists() && this.a.exists() && !this.b.delete()) {
            Log.e("AtomicFile", "Failed to delete outdated new file " + this.b);
        }
        return new FileInputStream(this.a);
    }

    public byte[] f() throws IOException {
        FileInputStream e = e();
        try {
            byte[] bArr = new byte[e.available()];
            int i = 0;
            while (true) {
                int read = e.read(bArr, i, bArr.length - i);
                if (read <= 0) {
                    return bArr;
                }
                i += read;
                int available = e.available();
                if (available > bArr.length - i) {
                    byte[] bArr2 = new byte[available + i];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    bArr = bArr2;
                }
            }
        } finally {
            e.close();
        }
    }

    public FileOutputStream h() throws IOException {
        if (this.c.exists()) {
            g(this.c, this.a);
        }
        try {
            return new FileOutputStream(this.b);
        } catch (FileNotFoundException unused) {
            if (this.b.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(this.b);
                } catch (FileNotFoundException e) {
                    throw new IOException("Failed to create new file " + this.b, e);
                }
            }
            throw new IOException("Failed to create directory for " + this.b);
        }
    }
}
