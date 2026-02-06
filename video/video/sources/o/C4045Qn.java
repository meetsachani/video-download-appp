package o;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: o.Qn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4045Qn implements InterfaceC8037mT1<Bitmap> {
    public static final C4274Sv1<Integer> b = C4274Sv1.g("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    public static final C4274Sv1<Bitmap.CompressFormat> c = C4274Sv1.f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    public static final String d = "BitmapEncoder";
    public final InterfaceC2727De a;

    public C4045Qn(InterfaceC2727De interfaceC2727De) {
        this.a = interfaceC2727De;
    }

    @Override // o.InterfaceC8037mT1
    public EnumC9770tb0 a(C5448bw1 c5448bw1) {
        return EnumC9770tb0.TRANSFORMED;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0076 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #4 {all -> 0x0056, blocks: (B:3:0x0021, B:16:0x0052, B:32:0x0070, B:34:0x0076, B:38:0x00c2, B:39:0x00c5, B:29:0x006b), top: B:49:0x0021 }] */
    @Override // o.InterfaceC2422Ab0
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b(InterfaceC5580cT1<Bitmap> interfaceC5580cT1, File file, C5448bw1 c5448bw1) {
        boolean z;
        Bitmap bitmap = interfaceC5580cT1.get();
        Bitmap.CompressFormat d2 = d(bitmap, c5448bw1);
        C5034aE0.e("encode: [%dx%d] %s", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), d2);
        try {
            long b2 = C5965e41.b();
            int intValue = ((Integer) c5448bw1.c(b)).intValue();
            C2481Aq c2481Aq = null;
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        if (this.a != null) {
                            c2481Aq = new C2481Aq(fileOutputStream, this.a);
                        } else {
                            c2481Aq = fileOutputStream;
                        }
                        bitmap.compress(d2, intValue, c2481Aq);
                        c2481Aq.close();
                        try {
                            c2481Aq.close();
                        } catch (IOException unused) {
                        }
                        z = true;
                    } catch (IOException e) {
                        e = e;
                        c2481Aq = fileOutputStream;
                        if (Log.isLoggable(d, 3)) {
                            Log.d(d, "Failed to encode Bitmap", e);
                        }
                        if (c2481Aq != null) {
                            try {
                                c2481Aq.close();
                            } catch (IOException unused2) {
                            }
                        }
                        z = false;
                        if (Log.isLoggable(d, 2)) {
                        }
                        return z;
                    } catch (Throwable th) {
                        th = th;
                        c2481Aq = fileOutputStream;
                        if (c2481Aq != null) {
                            try {
                                c2481Aq.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
                if (Log.isLoggable(d, 2)) {
                    Log.v(d, "Compressed with type: " + d2 + " of size " + SD2.i(bitmap) + " in " + C5965e41.a(b2) + ", options format: " + c5448bw1.c(c) + ", hasAlpha: " + bitmap.hasAlpha());
                }
                return z;
            } catch (Throwable th2) {
                th = th2;
            }
        } finally {
            C5034aE0.f();
        }
    }

    public final Bitmap.CompressFormat d(Bitmap bitmap, C5448bw1 c5448bw1) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c5448bw1.c(c);
        if (compressFormat != null) {
            return compressFormat;
        }
        if (bitmap.hasAlpha()) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    @Deprecated
    public C4045Qn() {
        this.a = null;
    }
}
