package o;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.yH2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10916yH2 implements SensorEventListener {
    @NotNull
    public static final a b = new a(null);
    public static final double c = 2.3d;
    @Nullable
    public b a;

    /* renamed from: o.yH2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: o.yH2$b */
    /* loaded from: classes2.dex */
    public interface b {
        void a();
    }

    public final void a(@Nullable b bVar) {
        if (SQ.e(this)) {
            return;
        }
        try {
            this.a = bVar;
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(@NotNull Sensor sensor, int i) {
        if (SQ.e(this)) {
            return;
        }
        try {
            C6562gT0.p(sensor, "sensor");
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(@NotNull SensorEvent sensorEvent) {
        if (!SQ.e(this)) {
            try {
                C6562gT0.p(sensorEvent, "event");
                b bVar = this.a;
                if (bVar != null) {
                    float[] fArr = sensorEvent.values;
                    double d = fArr[0] / 9.80665f;
                    double d2 = fArr[1] / 9.80665f;
                    double d3 = fArr[2] / 9.80665f;
                    if (Math.sqrt((d * d) + (d2 * d2) + (d3 * d3)) > 2.3d) {
                        bVar.a();
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }
}
