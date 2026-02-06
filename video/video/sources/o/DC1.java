package o;

import androidx.work.ListenableWorker;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import o.AbstractC7753lN2;

/* loaded from: classes.dex */
public final class DC1 extends AbstractC7753lN2 {
    public static final long g = 900000;
    public static final long h = 300000;

    public DC1(a builder) {
        super(builder.b, builder.c, builder.d);
    }

    /* loaded from: classes.dex */
    public static final class a extends AbstractC7753lN2.a<a, DC1> {
        public a(Class<? extends ListenableWorker> workerClass, long repeatInterval, TimeUnit repeatIntervalTimeUnit) {
            super(workerClass);
            this.c.f(repeatIntervalTimeUnit.toMillis(repeatInterval));
        }

        @Override // o.AbstractC7753lN2.a
        /* renamed from: r */
        public DC1 c() {
            if (this.a && this.c.j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new DC1(this);
        }

        public a(Class<? extends ListenableWorker> workerClass, Duration repeatInterval) {
            super(workerClass);
            long millis;
            C8501oN2 c8501oN2 = this.c;
            millis = repeatInterval.toMillis();
            c8501oN2.f(millis);
        }

        public a(Class<? extends ListenableWorker> workerClass, long repeatInterval, TimeUnit repeatIntervalTimeUnit, long flexInterval, TimeUnit flexIntervalTimeUnit) {
            super(workerClass);
            this.c.g(repeatIntervalTimeUnit.toMillis(repeatInterval), flexIntervalTimeUnit.toMillis(flexInterval));
        }

        public a(Class<? extends ListenableWorker> workerClass, Duration repeatInterval, Duration flexInterval) {
            super(workerClass);
            long millis;
            long millis2;
            C8501oN2 c8501oN2 = this.c;
            millis = repeatInterval.toMillis();
            millis2 = flexInterval.toMillis();
            c8501oN2.g(millis, millis2);
        }

        @Override // o.AbstractC7753lN2.a
        /* renamed from: s */
        public a d() {
            return this;
        }
    }
}
