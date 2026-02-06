package o;

import android.hardware.camera2.CameraAccessException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.Hv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3197Hv extends Exception {
    public static final int Y0 = 5;
    public static final int Z = 4;
    public static final int Z0 = 1;
    public static final int a1 = 2;
    public static final int b1 = 3;
    public static final int c1 = 1000;
    public static final Set<Integer> d1 = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));
    public static final int e1 = 10001;
    public static final int f1 = 10002;
    public static final Set<Integer> g1 = Collections.unmodifiableSet(new HashSet(Arrays.asList(Integer.valueOf((int) e1), Integer.valueOf((int) f1))));
    public final int X;
    public final CameraAccessException Y;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Hv$a */
    /* loaded from: classes.dex */
    public @interface a {
    }

    public C3197Hv(int i) {
        super(b(i));
        this.X = i;
        this.Y = d1.contains(Integer.valueOf(i)) ? new CameraAccessException(i) : null;
    }

    public static String a(int i, String str) {
        return String.format("%s (%d): %s", c(i), Integer.valueOf(i), str);
    }

    public static String b(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 10001) {
                                if (i != 10002) {
                                    return null;
                                }
                                return "Failed to create CameraCharacteristics.";
                            }
                            return "Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.";
                        }
                        return "The system-wide limit for number of open cameras has been reached, and more camera devices cannot be opened until previous instances are closed.";
                    }
                    return "The camera device is in use already";
                }
                return "The camera device is currently in the error state; no further calls to it will succeed.";
            }
            return "The camera device is removable and has been disconnected from the Android device, or the camera service has shut down the connection due to a higher-priority access request for the camera device.";
        }
        return "The camera is disabled due to a device policy, and cannot be opened.";
    }

    public static String c(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 1000) {
                                if (i != 10001) {
                                    if (i != 10002) {
                                        return "<UNKNOWN ERROR>";
                                    }
                                    return "CAMERA_CHARACTERISTICS_CREATION_ERROR";
                                }
                                return "CAMERA_UNAVAILABLE_DO_NOT_DISTURB";
                            }
                            return "CAMERA_DEPRECATED_HAL";
                        }
                        return "MAX_CAMERAS_IN_USE";
                    }
                    return "CAMERA_IN_USE";
                }
                return "CAMERA_ERROR";
            }
            return "CAMERA_DISCONNECTED";
        }
        return "CAMERA_DISABLED";
    }

    public static C3197Hv f(CameraAccessException cameraAccessException) {
        if (cameraAccessException != null) {
            return new C3197Hv(cameraAccessException);
        }
        throw new NullPointerException("cameraAccessException should not be null");
    }

    public final int d() {
        return this.X;
    }

    public CameraAccessException e() {
        return this.Y;
    }

    public C3197Hv(int i, String str) {
        super(a(i, str));
        this.X = i;
        this.Y = d1.contains(Integer.valueOf(i)) ? new CameraAccessException(i, str) : null;
    }

    public C3197Hv(int i, String str, Throwable th) {
        super(a(i, str), th);
        this.X = i;
        this.Y = d1.contains(Integer.valueOf(i)) ? new CameraAccessException(i, str, th) : null;
    }

    public C3197Hv(int i, Throwable th) {
        super(b(i), th);
        this.X = i;
        this.Y = d1.contains(Integer.valueOf(i)) ? new CameraAccessException(i, null, th) : null;
    }

    public C3197Hv(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.X = cameraAccessException.getReason();
        this.Y = cameraAccessException;
    }
}
