package o;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o.InterfaceC8368nr;

@Deprecated
/* loaded from: classes2.dex */
public class AD1 extends Exception implements InterfaceC8368nr {
    public static final int A1 = 6004;
    public static final int B1 = 6005;
    public static final int C1 = 6006;
    public static final int D1 = 6007;
    public static final int E1 = 6008;
    public static final int F1 = 7000;
    public static final int G1 = 7001;
    public static final int H1 = 1000000;
    public static final int N1 = 1000;
    public static final int Y0 = 1001;
    public static final int Z = 1000;
    public static final int Z0 = 1002;
    public static final int a1 = 1003;
    public static final int b1 = 1004;
    public static final int c1 = 2000;
    public static final int d1 = 2001;
    public static final int e1 = 2002;
    public static final int f1 = 2003;
    public static final int g1 = 2004;
    public static final int h1 = 2005;
    public static final int i1 = 2006;
    public static final int j1 = 2007;
    public static final int k1 = 2008;
    public static final int l1 = 3001;
    public static final int m1 = 3002;
    public static final int n1 = 3003;
    public static final int o1 = 3004;
    public static final int p1 = 4001;
    public static final int q1 = 4002;
    public static final int r1 = 4003;
    public static final int s1 = 4004;
    public static final int t1 = 4005;
    public static final int u1 = 5001;
    public static final int v1 = 5002;
    public static final int w1 = 6000;
    public static final int x1 = 6001;
    public static final int y1 = 6002;
    public static final int z1 = 6003;
    public final int X;
    public final long Y;
    public static final String I1 = TD2.R0(0);
    public static final String J1 = TD2.R0(1);
    public static final String K1 = TD2.R0(2);
    public static final String L1 = TD2.R0(3);
    public static final String M1 = TD2.R0(4);
    public static final InterfaceC8368nr.a<AD1> O1 = new InterfaceC8368nr.a() { // from class: o.zD1
        @Override // o.InterfaceC8368nr.a
        public final InterfaceC8368nr a(Bundle bundle) {
            return new AD1(bundle);
        }
    };

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface a {
    }

    public AD1(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 Throwable th, int i) {
        this(str, th, i, LD.a.b());
    }

    public static RemoteException a(@InterfaceC11300zs1 String str) {
        return new RemoteException(str);
    }

    public static Throwable b(Class<?> cls, @InterfaceC11300zs1 String str) throws Exception {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    @InterfaceC11300zs1
    public static Throwable d(Bundle bundle) {
        String string = bundle.getString(L1);
        String string2 = bundle.getString(M1);
        Throwable th = null;
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, AD1.class.getClassLoader());
            if (Throwable.class.isAssignableFrom(cls)) {
                th = b(cls, string2);
            }
            if (th == null) {
                return a(string2);
            }
            return th;
        } catch (Throwable unused) {
            return a(string2);
        }
    }

    public static String g(int i) {
        if (i != 5001) {
            if (i != 5002) {
                if (i != 7000) {
                    if (i != 7001) {
                        switch (i) {
                            case 1000:
                                return "ERROR_CODE_UNSPECIFIED";
                            case 1001:
                                return "ERROR_CODE_REMOTE_ERROR";
                            case 1002:
                                return "ERROR_CODE_BEHIND_LIVE_WINDOW";
                            case 1003:
                                return "ERROR_CODE_TIMEOUT";
                            case 1004:
                                return "ERROR_CODE_FAILED_RUNTIME_CHECK";
                            default:
                                switch (i) {
                                    case 2000:
                                        return "ERROR_CODE_IO_UNSPECIFIED";
                                    case 2001:
                                        return "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                                    case 2002:
                                        return "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                                    case 2003:
                                        return "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                                    case 2004:
                                        return "ERROR_CODE_IO_BAD_HTTP_STATUS";
                                    case h1 /* 2005 */:
                                        return "ERROR_CODE_IO_FILE_NOT_FOUND";
                                    case 2006:
                                        return "ERROR_CODE_IO_NO_PERMISSION";
                                    case j1 /* 2007 */:
                                        return "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                                    case 2008:
                                        return "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                                    default:
                                        switch (i) {
                                            case 3001:
                                                return "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                            case m1 /* 3002 */:
                                                return "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                            case n1 /* 3003 */:
                                                return "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                            case o1 /* 3004 */:
                                                return "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                            default:
                                                switch (i) {
                                                    case p1 /* 4001 */:
                                                        return "ERROR_CODE_DECODER_INIT_FAILED";
                                                    case q1 /* 4002 */:
                                                        return "ERROR_CODE_DECODER_QUERY_FAILED";
                                                    case r1 /* 4003 */:
                                                        return "ERROR_CODE_DECODING_FAILED";
                                                    case s1 /* 4004 */:
                                                        return "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                                    case t1 /* 4005 */:
                                                        return "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                                    default:
                                                        switch (i) {
                                                            case 6000:
                                                                return "ERROR_CODE_DRM_UNSPECIFIED";
                                                            case 6001:
                                                                return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                            case 6002:
                                                                return "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                            case 6003:
                                                                return "ERROR_CODE_DRM_CONTENT_ERROR";
                                                            case A1 /* 6004 */:
                                                                return "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                            case B1 /* 6005 */:
                                                                return "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                            case C1 /* 6006 */:
                                                                return "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                            case D1 /* 6007 */:
                                                                return "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                            case E1 /* 6008 */:
                                                                return "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                            default:
                                                                if (i >= 1000000) {
                                                                    return "custom error code";
                                                                }
                                                                return "invalid error code";
                                                        }
                                                }
                                        }
                                }
                        }
                    }
                    return "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";
                }
                return "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";
            }
            return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
        }
        return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (r3 == null) goto L18;
     */
    @InterfaceC2591Bt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(@InterfaceC11300zs1 AD1 ad1) {
        if (this == ad1) {
            return true;
        }
        if (ad1 != null && getClass() == ad1.getClass()) {
            Throwable cause = getCause();
            Throwable cause2 = ad1.getCause();
            if (cause != null && cause2 != null) {
                if (!TD2.g(cause.getMessage(), cause2.getMessage()) || !TD2.g(cause.getClass(), cause2.getClass())) {
                    return false;
                }
            } else if (cause == null) {
            }
            if (this.X == ad1.X && TD2.g(getMessage(), ad1.getMessage()) && this.Y == ad1.Y) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC8368nr
    @InterfaceC2591Bt
    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putInt(I1, this.X);
        bundle.putLong(J1, this.Y);
        bundle.putString(K1, getMessage());
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(L1, cause.getClass().getName());
            bundle.putString(M1, cause.getMessage());
        }
        return bundle;
    }

    public final String f() {
        return g(this.X);
    }

    public AD1(Bundle bundle) {
        this(bundle.getString(K1), d(bundle), bundle.getInt(I1, 1000), bundle.getLong(J1, SystemClock.elapsedRealtime()));
    }

    public AD1(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 Throwable th, int i, long j) {
        super(str, th);
        this.X = i;
        this.Y = j;
    }
}
