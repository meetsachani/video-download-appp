package o;

import java.util.concurrent.TimeUnit;
import o.AbstractC5318bO1;

@InterfaceC5601ca0
@InterfaceC11149zF0
/* renamed from: o.w92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10398w92 extends AbstractC5318bO1 {
    public double c;
    public double d;
    public double e;
    public long f;

    /* renamed from: o.w92$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC10398w92 {
        public final double g;

        public b(AbstractC5318bO1.a aVar, double d) {
            super(aVar);
            this.g = d;
        }

        @Override // o.AbstractC10398w92
        public double v() {
            return this.e;
        }

        @Override // o.AbstractC10398w92
        public void w(double d, double d2) {
            double d3 = this.d;
            double d4 = this.g * d;
            this.d = d4;
            if (d3 == Double.POSITIVE_INFINITY) {
                this.c = d4;
                return;
            }
            double d5 = 0.0d;
            if (d3 != 0.0d) {
                d5 = (this.c * d4) / d3;
            }
            this.c = d5;
        }

        @Override // o.AbstractC10398w92
        public long y(double d, double d2) {
            return 0L;
        }
    }

    /* renamed from: o.w92$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC10398w92 {
        public final long g;
        public double h;
        public double i;
        public double j;

        public c(AbstractC5318bO1.a aVar, long j, TimeUnit timeUnit, double d) {
            super(aVar);
            this.g = timeUnit.toMicros(j);
            this.j = d;
        }

        @Override // o.AbstractC10398w92
        public double v() {
            return this.g / this.d;
        }

        @Override // o.AbstractC10398w92
        public void w(double d, double d2) {
            double d3 = this.d;
            double d4 = this.j * d2;
            long j = this.g;
            double d5 = (j * 0.5d) / d2;
            this.i = d5;
            double d6 = ((j * 2.0d) / (d2 + d4)) + d5;
            this.d = d6;
            this.h = (d4 - d2) / (d6 - d5);
            if (d3 == Double.POSITIVE_INFINITY) {
                this.c = 0.0d;
                return;
            }
            if (d3 != 0.0d) {
                d6 = (this.c * d6) / d3;
            }
            this.c = d6;
        }

        @Override // o.AbstractC10398w92
        public long y(double d, double d2) {
            long j;
            double d3 = d - this.i;
            if (d3 > 0.0d) {
                double min = Math.min(d3, d2);
                j = (long) (((z(d3) + z(d3 - min)) * min) / 2.0d);
                d2 -= min;
            } else {
                j = 0;
            }
            return j + ((long) (this.e * d2));
        }

        public final double z(double d) {
            return this.e + (d * this.h);
        }
    }

    @Override // o.AbstractC5318bO1
    public final double i() {
        return TimeUnit.SECONDS.toMicros(1L) / this.e;
    }

    @Override // o.AbstractC5318bO1
    public final void j(double d, long j) {
        x(j);
        double micros = TimeUnit.SECONDS.toMicros(1L) / d;
        this.e = micros;
        w(d, micros);
    }

    @Override // o.AbstractC5318bO1
    public final long m(long j) {
        return this.f;
    }

    @Override // o.AbstractC5318bO1
    public final long p(int i, long j) {
        x(j);
        long j2 = this.f;
        double d = i;
        double min = Math.min(d, this.c);
        this.f = R41.x(this.f, y(this.c, min) + ((long) ((d - min) * this.e)));
        this.c -= min;
        return j2;
    }

    public abstract double v();

    public abstract void w(double d, double d2);

    public void x(long j) {
        long j2 = this.f;
        if (j > j2) {
            this.c = Math.min(this.d, this.c + ((j - j2) / v()));
            this.f = j;
        }
    }

    public abstract long y(double d, double d2);

    public AbstractC10398w92(AbstractC5318bO1.a aVar) {
        super(aVar);
        this.f = 0L;
    }
}
