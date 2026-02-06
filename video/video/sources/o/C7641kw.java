package o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: o.kw  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7641kw {
    public final a b;
    public final String c;
    public final Map<CameraCharacteristics.Key<?>, Object> a = new HashMap();
    public C10266vd2 d = null;

    /* renamed from: o.kw$a */
    /* loaded from: classes.dex */
    public interface a {
        <T> T a(CameraCharacteristics.Key<T> key);

        Set<String> b();

        CameraCharacteristics e();
    }

    public C7641kw(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.b = new C7155iw(cameraCharacteristics);
        } else {
            this.b = new C7398jw(cameraCharacteristics);
        }
        this.c = str;
    }

    public static C7641kw f(CameraCharacteristics cameraCharacteristics, String str) {
        return new C7641kw(cameraCharacteristics, str);
    }

    public <T> T a(CameraCharacteristics.Key<T> key) {
        if (d(key)) {
            return (T) this.b.a(key);
        }
        synchronized (this) {
            try {
                T t = (T) this.a.get(key);
                if (t != null) {
                    return t;
                }
                T t2 = (T) this.b.a(key);
                if (t2 != null) {
                    this.a.put(key, t2);
                }
                return t2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Set<String> b() {
        return this.b.b();
    }

    public C10266vd2 c() {
        if (this.d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap != null) {
                    this.d = C10266vd2.e(streamConfigurationMap, new C5694cx1(this.c));
                } else {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
            } catch (AssertionError e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }
        return this.d;
    }

    public final boolean d(CameraCharacteristics.Key<?> key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return true;
        }
        return false;
    }

    public CameraCharacteristics e() {
        return this.b.e();
    }
}
