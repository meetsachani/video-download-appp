package o;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.yd2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10998yd2 implements InterfaceC2422Ab0<InputStream> {
    public static final String b = "StreamEncoder";
    public final InterfaceC2727De a;

    public C10998yd2(InterfaceC2727De interfaceC2727De) {
        this.a = interfaceC2727De;
    }

    @Override // o.InterfaceC2422Ab0
    /* renamed from: c */
    public boolean b(InputStream inputStream, File file, C5448bw1 c5448bw1) {
        byte[] bArr = (byte[]) this.a.c(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable(b, 3)) {
                            Log.d(b, "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        this.a.put(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        this.a.put(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                this.a.put(bArr);
                return true;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
