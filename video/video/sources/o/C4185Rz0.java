package o;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o.Rz0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4185Rz0 {
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    public static final int k = 8;
    public static final int l = 1;
    public static final int m = 2;
    public static final int n = 4;

    /* renamed from: o  reason: collision with root package name */
    public static final int f603o = 8;
    public static final int p = 16;
    public static final int q = 32;
    public static final int r = 64;
    public static final int s = 128;
    public static final int t = 256;
    public static final int u = 511;
    public final b a;

    /* renamed from: o.Rz0$a */
    /* loaded from: classes.dex */
    public static class a extends b {
        public static final int e = 1000000;
        public static final int f = 500000;
        public static HandlerThread g;
        public static Handler h;
        public int a;
        public SparseIntArray[] b = new SparseIntArray[9];
        public final ArrayList<WeakReference<Activity>> c = new ArrayList<>();
        public Window.OnFrameMetricsAvailableListener d = new Window$OnFrameMetricsAvailableListenerC0227a();

        /* renamed from: o.Rz0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class Window$OnFrameMetricsAvailableListenerC0227a implements Window.OnFrameMetricsAvailableListener {
            public Window$OnFrameMetricsAvailableListenerC0227a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                a aVar = a.this;
                if ((aVar.a & 1) != 0) {
                    aVar.f(aVar.b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.a & 2) != 0) {
                    aVar2.f(aVar2.b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.a & 4) != 0) {
                    aVar3.f(aVar3.b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.a & 8) != 0) {
                    aVar4.f(aVar4.b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.a & 16) != 0) {
                    aVar5.f(aVar5.b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.a & 64) != 0) {
                    aVar6.f(aVar6.b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.a & 32) != 0) {
                    aVar7.f(aVar7.b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.a & 128) != 0) {
                    aVar8.f(aVar8.b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.a & 256) != 0) {
                    aVar9.f(aVar9.b[8], frameMetrics.getMetric(2));
                }
            }
        }

        public a(int i) {
            this.a = i;
        }

        @Override // o.C4185Rz0.b
        public void a(Activity activity) {
            if (g == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                g = handlerThread;
                handlerThread.start();
                h = new Handler(g.getLooper());
            }
            for (int i = 0; i <= 8; i++) {
                SparseIntArray[] sparseIntArrayArr = this.b;
                if (sparseIntArrayArr[i] == null && (this.a & (1 << i)) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.d, h);
            this.c.add(new WeakReference<>(activity));
        }

        @Override // o.C4185Rz0.b
        public SparseIntArray[] b() {
            return this.b;
        }

        @Override // o.C4185Rz0.b
        public SparseIntArray[] c(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    this.c.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.d);
            return this.b;
        }

        @Override // o.C4185Rz0.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.b;
            this.b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // o.C4185Rz0.b
        public SparseIntArray[] e() {
            for (int size = this.c.size() - 1; size >= 0; size--) {
                WeakReference<Activity> weakReference = this.c.get(size);
                Activity activity = weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.d);
                    this.c.remove(size);
                }
            }
            return this.b;
        }

        public void f(SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int i = (int) ((C6118ei0.r2 + j) / 1000000);
                if (j >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Rz0$c */
    /* loaded from: classes.dex */
    public @interface c {
    }

    public C4185Rz0() {
        this(1);
    }

    public void a(Activity activity) {
        this.a.a(activity);
    }

    public SparseIntArray[] b() {
        return this.a.b();
    }

    public SparseIntArray[] c(Activity activity) {
        return this.a.c(activity);
    }

    public SparseIntArray[] d() {
        return this.a.d();
    }

    public SparseIntArray[] e() {
        return this.a.e();
    }

    public C4185Rz0(int i2) {
        this.a = new a(i2);
    }

    /* renamed from: o.Rz0$b */
    /* loaded from: classes.dex */
    public static class b {
        public SparseIntArray[] b() {
            return null;
        }

        public SparseIntArray[] c(Activity activity) {
            return null;
        }

        public SparseIntArray[] d() {
            return null;
        }

        public SparseIntArray[] e() {
            return null;
        }

        public void a(Activity activity) {
        }
    }
}
