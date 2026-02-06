package o;

import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import o.C7746lM;
import o.TM2;

/* renamed from: o.vN2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10208vN2 {

    /* renamed from: o.vN2$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[EnumC2505Aw1.values().length];
            d = iArr;
            try {
                iArr[EnumC2505Aw1.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[EnumC2505Aw1.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC3763Np1.values().length];
            c = iArr2;
            try {
                iArr2[EnumC3763Np1.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[EnumC3763Np1.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[EnumC3763Np1.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                c[EnumC3763Np1.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                c[EnumC3763Np1.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[EnumC11023yk.values().length];
            b = iArr3;
            try {
                iArr3[EnumC11023yk.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[EnumC11023yk.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[TM2.a.values().length];
            a = iArr4;
            try {
                iArr4[TM2.a.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[TM2.a.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[TM2.a.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[TM2.a.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[TM2.a.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[TM2.a.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* renamed from: o.vN2$b */
    /* loaded from: classes.dex */
    public interface b {
        public static final int a = 0;
        public static final int b = 1;
    }

    /* renamed from: o.vN2$c */
    /* loaded from: classes.dex */
    public interface c {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;
        public static final int f = 5;
    }

    /* renamed from: o.vN2$d */
    /* loaded from: classes.dex */
    public interface d {
        public static final int a = 0;
        public static final int b = 1;
    }

    /* renamed from: o.vN2$e */
    /* loaded from: classes.dex */
    public interface e {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;
        public static final int f = 5;
        public static final String g = "(2, 3, 5)";
    }

    public static int a(EnumC11023yk backoffPolicy) {
        int i = a.b[backoffPolicy.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            throw new IllegalArgumentException("Could not convert " + backoffPolicy + " to int");
        }
        return 0;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:4|5|(4:6|7|(2:9|10)|(2:12|13))|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
        r6.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C7746lM b(byte[] bytes) {
        Throwable th;
        ObjectInputStream objectInputStream;
        IOException e2;
        C7746lM c7746lM = new C7746lM();
        if (bytes != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            ObjectInputStream objectInputStream2 = null;
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                } catch (IOException e3) {
                    objectInputStream = null;
                    e2 = e3;
                } catch (Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                    }
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    throw th;
                }
                try {
                    for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                        c7746lM.a(Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean());
                    }
                    try {
                        objectInputStream.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                } catch (IOException e6) {
                    e2 = e6;
                    e2.printStackTrace();
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                    }
                    byteArrayInputStream.close();
                    return c7746lM;
                }
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th = th3;
                if (0 != 0) {
                    try {
                        objectInputStream2.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                }
                byteArrayInputStream.close();
                throw th;
            }
        }
        return c7746lM;
    }

    public static byte[] c(C7746lM triggers) {
        ObjectOutputStream objectOutputStream = null;
        if (triggers.c() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(triggers.c());
                    for (C7746lM.a aVar : triggers.b()) {
                        objectOutputStream2.writeUTF(aVar.a().toString());
                        objectOutputStream2.writeBoolean(aVar.b());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                } catch (IOException e3) {
                    e = e3;
                    objectOutputStream = objectOutputStream2;
                    e.printStackTrace();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e7) {
            e = e7;
        }
        try {
            byteArrayOutputStream.close();
        } catch (IOException e8) {
            e8.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static EnumC11023yk d(int value) {
        if (value != 0) {
            if (value == 1) {
                return EnumC11023yk.LINEAR;
            }
            throw new IllegalArgumentException("Could not convert " + value + " to BackoffPolicy");
        }
        return EnumC11023yk.EXPONENTIAL;
    }

    public static EnumC3763Np1 e(int value) {
        if (value != 0) {
            if (value != 1) {
                if (value != 2) {
                    if (value != 3) {
                        if (value != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && value == 5) {
                                return EnumC3763Np1.TEMPORARILY_UNMETERED;
                            }
                            throw new IllegalArgumentException("Could not convert " + value + " to NetworkType");
                        }
                        return EnumC3763Np1.METERED;
                    }
                    return EnumC3763Np1.NOT_ROAMING;
                }
                return EnumC3763Np1.UNMETERED;
            }
            return EnumC3763Np1.CONNECTED;
        }
        return EnumC3763Np1.NOT_REQUIRED;
    }

    public static EnumC2505Aw1 f(int value) {
        if (value != 0) {
            if (value == 1) {
                return EnumC2505Aw1.DROP_WORK_REQUEST;
            }
            throw new IllegalArgumentException("Could not convert " + value + " to OutOfQuotaPolicy");
        }
        return EnumC2505Aw1.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
    }

    public static TM2.a g(int value) {
        if (value != 0) {
            if (value != 1) {
                if (value != 2) {
                    if (value != 3) {
                        if (value != 4) {
                            if (value == 5) {
                                return TM2.a.CANCELLED;
                            }
                            throw new IllegalArgumentException("Could not convert " + value + " to State");
                        }
                        return TM2.a.BLOCKED;
                    }
                    return TM2.a.FAILED;
                }
                return TM2.a.SUCCEEDED;
            }
            return TM2.a.RUNNING;
        }
        return TM2.a.ENQUEUED;
    }

    public static int h(EnumC3763Np1 networkType) {
        int i = a.c[networkType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 3) {
                return 2;
            }
            if (i == 4) {
                return 3;
            }
            if (i == 5) {
                return 4;
            }
            if (Build.VERSION.SDK_INT >= 30 && networkType == EnumC3763Np1.TEMPORARILY_UNMETERED) {
                return 5;
            }
            throw new IllegalArgumentException("Could not convert " + networkType + " to int");
        }
        return 0;
    }

    public static int i(EnumC2505Aw1 policy) {
        int i = a.d[policy.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            throw new IllegalArgumentException("Could not convert " + policy + " to int");
        }
        return 0;
    }

    public static int j(TM2.a state) {
        switch (a.a[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + state + " to int");
        }
    }
}
