package o;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: o.mD0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7972mD0 implements InterfaceC8037mT1<C7468kD0> {
    public static final String a = "GifEncoder";

    @Override // o.InterfaceC8037mT1
    public EnumC9770tb0 a(C5448bw1 c5448bw1) {
        return EnumC9770tb0.SOURCE;
    }

    @Override // o.InterfaceC2422Ab0
    /* renamed from: c */
    public boolean b(InterfaceC5580cT1<C7468kD0> interfaceC5580cT1, File file, C5448bw1 c5448bw1) {
        try {
            C4452Ur.f(interfaceC5580cT1.get().e(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable(a, 5)) {
                Log.w(a, "Failed to encode GIF drawable data", e);
                return false;
            }
            return false;
        }
    }
}
