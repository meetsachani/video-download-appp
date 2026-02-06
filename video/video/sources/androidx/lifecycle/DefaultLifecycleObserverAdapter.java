package androidx.lifecycle;

import androidx.lifecycle.f;
import o.C6562gT0;
import o.InterfaceC10494wZ;
import o.KZ0;

/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements i {
    public final InterfaceC10494wZ X;
    public final i Y;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f.a.values().length];
            try {
                iArr[f.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[f.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[f.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(InterfaceC10494wZ interfaceC10494wZ, i iVar) {
        C6562gT0.p(interfaceC10494wZ, "defaultLifecycleObserver");
        this.X = interfaceC10494wZ;
        this.Y = iVar;
    }

    @Override // androidx.lifecycle.i
    public void i(KZ0 kz0, f.a aVar) {
        C6562gT0.p(kz0, "source");
        C6562gT0.p(aVar, "event");
        switch (a.a[aVar.ordinal()]) {
            case 1:
                this.X.h(kz0);
                break;
            case 2:
                this.X.onStart(kz0);
                break;
            case 3:
                this.X.onResume(kz0);
                break;
            case 4:
                this.X.onPause(kz0);
                break;
            case 5:
                this.X.onStop(kz0);
                break;
            case 6:
                this.X.onDestroy(kz0);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        i iVar = this.Y;
        if (iVar != null) {
            iVar.i(kz0, aVar);
        }
    }
}
