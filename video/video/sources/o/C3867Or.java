package o;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: o.Or  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3867Or implements InterfaceC2422Ab0<ByteBuffer> {
    public static final String a = "ByteBufferEncoder";

    @Override // o.InterfaceC2422Ab0
    /* renamed from: c */
    public boolean b(ByteBuffer byteBuffer, File file, C5448bw1 c5448bw1) {
        try {
            C4452Ur.f(byteBuffer, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable(a, 3)) {
                Log.d(a, "Failed to write data", e);
                return false;
            }
            return false;
        }
    }
}
