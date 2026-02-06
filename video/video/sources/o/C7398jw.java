package o;

import android.hardware.camera2.CameraCharacteristics;
import java.util.Collections;
import java.util.Set;
import o.C7641kw;

/* renamed from: o.jw  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7398jw implements C7641kw.a {
    public final CameraCharacteristics a;

    public C7398jw(CameraCharacteristics cameraCharacteristics) {
        this.a = cameraCharacteristics;
    }

    @Override // o.C7641kw.a
    public <T> T a(CameraCharacteristics.Key<T> key) {
        return (T) this.a.get(key);
    }

    @Override // o.C7641kw.a
    public Set<String> b() {
        return Collections.EMPTY_SET;
    }

    @Override // o.C7641kw.a
    public CameraCharacteristics e() {
        return this.a;
    }
}
