package androidx.camera.lifecycle;

import androidx.camera.lifecycle.LifecycleCameraRepository;
import o.C3984Px;
import o.KZ0;

/* loaded from: classes.dex */
public final class a extends LifecycleCameraRepository.a {
    public final KZ0 a;
    public final C3984Px.b b;

    public a(KZ0 kz0, C3984Px.b bVar) {
        if (kz0 != null) {
            this.a = kz0;
            if (bVar != null) {
                this.b = bVar;
                return;
            }
            throw new NullPointerException("Null cameraId");
        }
        throw new NullPointerException("Null lifecycleOwner");
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.a
    public C3984Px.b b() {
        return this.b;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.a
    public KZ0 c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LifecycleCameraRepository.a) {
            LifecycleCameraRepository.a aVar = (LifecycleCameraRepository.a) obj;
            if (this.a.equals(aVar.c()) && this.b.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwner=" + this.a + ", cameraId=" + this.b + "}";
    }
}
