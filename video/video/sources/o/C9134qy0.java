package o;

import androidx.lifecycle.LiveData;

/* renamed from: o.qy0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9134qy0<T> extends C4511Vh1<T> {
    public LiveData<T> n;

    @Override // androidx.lifecycle.LiveData
    public T f() {
        LiveData<T> liveData = this.n;
        if (liveData == null) {
            return null;
        }
        return liveData.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void u(LiveData<T> liveData) {
        LiveData liveData2 = (LiveData<T>) this.n;
        if (liveData2 != null) {
            super.t(liveData2);
        }
        this.n = liveData;
        super.s(liveData, new InterfaceC3583Lt1() { // from class: o.py0
            @Override // o.InterfaceC3583Lt1
            public final void b(Object obj) {
                C9134qy0.this.r(obj);
            }
        });
    }
}
