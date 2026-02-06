package androidx.work;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import o.AbstractC6949i41;
import o.C6566gU0;

/* loaded from: classes.dex */
public final class b {
    public static final String b = AbstractC6949i41.f("Data");
    public static final b c = new a().a();
    public static final int d = 10240;
    public Map<String, Object> a;

    /* loaded from: classes.dex */
    public static final class a {
        public Map<String, Object> a = new HashMap();

        public b a() {
            b bVar = new b(this.a);
            b.F(bVar);
            return bVar;
        }

        public a b(String key, Object value) {
            if (value == null) {
                this.a.put(key, null);
                return this;
            }
            Class<?> cls = value.getClass();
            if (cls != Boolean.class && cls != Byte.class && cls != Integer.class && cls != Long.class && cls != Float.class && cls != Double.class && cls != String.class && cls != Boolean[].class && cls != Byte[].class && cls != Integer[].class && cls != Long[].class && cls != Float[].class && cls != Double[].class && cls != String[].class) {
                if (cls == boolean[].class) {
                    this.a.put(key, b.a((boolean[]) value));
                    return this;
                } else if (cls == byte[].class) {
                    this.a.put(key, b.b((byte[]) value));
                    return this;
                } else if (cls == int[].class) {
                    this.a.put(key, b.e((int[]) value));
                    return this;
                } else if (cls == long[].class) {
                    this.a.put(key, b.f((long[]) value));
                    return this;
                } else if (cls == float[].class) {
                    this.a.put(key, b.d((float[]) value));
                    return this;
                } else if (cls == double[].class) {
                    this.a.put(key, b.c((double[]) value));
                    return this;
                } else {
                    throw new IllegalArgumentException(String.format("Key %s has invalid type %s", key, cls));
                }
            }
            this.a.put(key, value);
            return this;
        }

        public a c(b data) {
            d(data.a);
            return this;
        }

        public a d(Map<String, Object> values) {
            for (Map.Entry<String, Object> entry : values.entrySet()) {
                b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public a e(String key, boolean value) {
            this.a.put(key, Boolean.valueOf(value));
            return this;
        }

        public a f(String key, boolean[] value) {
            this.a.put(key, b.a(value));
            return this;
        }

        public a g(String key, byte value) {
            this.a.put(key, Byte.valueOf(value));
            return this;
        }

        public a h(String key, byte[] value) {
            this.a.put(key, b.b(value));
            return this;
        }

        public a i(String key, double value) {
            this.a.put(key, Double.valueOf(value));
            return this;
        }

        public a j(String key, double[] value) {
            this.a.put(key, b.c(value));
            return this;
        }

        public a k(String key, float value) {
            this.a.put(key, Float.valueOf(value));
            return this;
        }

        public a l(String key, float[] value) {
            this.a.put(key, b.d(value));
            return this;
        }

        public a m(String key, int value) {
            this.a.put(key, Integer.valueOf(value));
            return this;
        }

        public a n(String key, int[] value) {
            this.a.put(key, b.e(value));
            return this;
        }

        public a o(String key, long value) {
            this.a.put(key, Long.valueOf(value));
            return this;
        }

        public a p(String key, long[] value) {
            this.a.put(key, b.f(value));
            return this;
        }

        public a q(String key, String value) {
            this.a.put(key, value);
            return this;
        }

        public a r(String key, String[] value) {
            this.a.put(key, value);
            return this;
        }
    }

    public b() {
    }

    public static byte[] F(b data) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(data.D());
                    for (Map.Entry<String, Object> entry : data.a.entrySet()) {
                        objectOutputStream2.writeUTF(entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e) {
                        Log.e(b, "Error in Data#toByteArray: ", e);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e2) {
                        Log.e(b, "Error in Data#toByteArray: ", e2);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e3) {
                    e = e3;
                    objectOutputStream = objectOutputStream2;
                    Log.e(b, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e4) {
                            Log.e(b, "Error in Data#toByteArray: ", e4);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e5) {
                        Log.e(b, "Error in Data#toByteArray: ", e5);
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e6) {
                            Log.e(b, "Error in Data#toByteArray: ", e6);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e7) {
                        Log.e(b, "Error in Data#toByteArray: ", e7);
                    }
                    throw th;
                }
            } catch (IOException e8) {
                e = e8;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Boolean[] a(boolean[] value) {
        Boolean[] boolArr = new Boolean[value.length];
        for (int i = 0; i < value.length; i++) {
            boolArr[i] = Boolean.valueOf(value[i]);
        }
        return boolArr;
    }

    public static Byte[] b(byte[] value) {
        Byte[] bArr = new Byte[value.length];
        for (int i = 0; i < value.length; i++) {
            bArr[i] = Byte.valueOf(value[i]);
        }
        return bArr;
    }

    public static Double[] c(double[] value) {
        Double[] dArr = new Double[value.length];
        for (int i = 0; i < value.length; i++) {
            dArr[i] = Double.valueOf(value[i]);
        }
        return dArr;
    }

    public static Float[] d(float[] value) {
        Float[] fArr = new Float[value.length];
        for (int i = 0; i < value.length; i++) {
            fArr[i] = Float.valueOf(value[i]);
        }
        return fArr;
    }

    public static Integer[] e(int[] value) {
        Integer[] numArr = new Integer[value.length];
        for (int i = 0; i < value.length; i++) {
            numArr[i] = Integer.valueOf(value[i]);
        }
        return numArr;
    }

    public static Long[] f(long[] value) {
        Long[] lArr = new Long[value.length];
        for (int i = 0; i < value.length; i++) {
            lArr[i] = Long.valueOf(value[i]);
        }
        return lArr;
    }

    public static byte[] g(Byte[] array) {
        byte[] bArr = new byte[array.length];
        for (int i = 0; i < array.length; i++) {
            bArr[i] = array[i].byteValue();
        }
        return bArr;
    }

    public static double[] h(Double[] array) {
        double[] dArr = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            dArr[i] = array[i].doubleValue();
        }
        return dArr;
    }

    public static float[] i(Float[] array) {
        float[] fArr = new float[array.length];
        for (int i = 0; i < array.length; i++) {
            fArr[i] = array[i].floatValue();
        }
        return fArr;
    }

    public static int[] j(Integer[] array) {
        int[] iArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            iArr[i] = array[i].intValue();
        }
        return iArr;
    }

    public static long[] k(Long[] array) {
        long[] jArr = new long[array.length];
        for (int i = 0; i < array.length; i++) {
            jArr[i] = array[i].longValue();
        }
        return jArr;
    }

    public static boolean[] l(Boolean[] array) {
        boolean[] zArr = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            zArr[i] = array[i].booleanValue();
        }
        return zArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b m(byte[] bytes) {
        Throwable th;
        ObjectInputStream objectInputStream;
        Throwable e;
        if (bytes.length <= 10240) {
            HashMap hashMap = new HashMap();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            ObjectInputStream objectInputStream2 = null;
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                } catch (IOException e2) {
                    e = e2;
                    Throwable th2 = e;
                    objectInputStream = null;
                    e = th2;
                    Log.e(b, "Error in Data#fromByteArray: ", e);
                    if (objectInputStream != null) {
                    }
                    byteArrayInputStream.close();
                    return new b(hashMap);
                } catch (ClassNotFoundException e3) {
                    e = e3;
                    Throwable th22 = e;
                    objectInputStream = null;
                    e = th22;
                    Log.e(b, "Error in Data#fromByteArray: ", e);
                    if (objectInputStream != null) {
                    }
                    byteArrayInputStream.close();
                    return new b(hashMap);
                } catch (Throwable th3) {
                    th = th3;
                    if (0 != 0) {
                    }
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException e4) {
                        Log.e(b, "Error in Data#fromByteArray: ", e4);
                    }
                    throw th;
                }
                try {
                    for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                        hashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                    }
                    try {
                        objectInputStream.close();
                    } catch (IOException e5) {
                        Log.e(b, "Error in Data#fromByteArray: ", e5);
                    }
                } catch (IOException e6) {
                    e = e6;
                    Log.e(b, "Error in Data#fromByteArray: ", e);
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e7) {
                            Log.e(b, "Error in Data#fromByteArray: ", e7);
                        }
                    }
                    byteArrayInputStream.close();
                    return new b(hashMap);
                } catch (ClassNotFoundException e8) {
                    e = e8;
                    Log.e(b, "Error in Data#fromByteArray: ", e);
                    if (objectInputStream != null) {
                    }
                    byteArrayInputStream.close();
                    return new b(hashMap);
                }
                try {
                    byteArrayInputStream.close();
                } catch (IOException e9) {
                    Log.e(b, "Error in Data#fromByteArray: ", e9);
                }
                return new b(hashMap);
            } catch (Throwable th4) {
                th = th4;
                if (0 != 0) {
                    try {
                        objectInputStream2.close();
                    } catch (IOException e10) {
                        Log.e(b, "Error in Data#fromByteArray: ", e10);
                    }
                }
                byteArrayInputStream.close();
                throw th;
            }
        }
        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
    }

    public String A(String key) {
        Object obj = this.a.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public String[] B(String key) {
        Object obj = this.a.get(key);
        if (obj instanceof String[]) {
            return (String[]) obj;
        }
        return null;
    }

    public <T> boolean C(String key, Class<T> klass) {
        Object obj = this.a.get(key);
        if (obj != null && klass.isAssignableFrom(obj.getClass())) {
            return true;
        }
        return false;
    }

    public int D() {
        return this.a.size();
    }

    public byte[] E() {
        return F(this);
    }

    public boolean equals(Object o2) {
        boolean z;
        if (this == o2) {
            return true;
        }
        if (o2 == null || b.class != o2.getClass()) {
            return false;
        }
        b bVar = (b) o2;
        Set<String> keySet = this.a.keySet();
        if (!keySet.equals(bVar.a.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj = this.a.get(str);
            Object obj2 = bVar.a.get(str);
            if (obj != null && obj2 != null) {
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    z = Arrays.deepEquals((Object[]) obj, (Object[]) obj2);
                    continue;
                } else {
                    z = obj.equals(obj2);
                    continue;
                }
            } else if (obj == obj2) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.a.hashCode() * 31;
    }

    public boolean n(String key, boolean defaultValue) {
        Object obj = this.a.get(key);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return defaultValue;
    }

    public boolean[] o(String key) {
        Object obj = this.a.get(key);
        if (obj instanceof Boolean[]) {
            return l((Boolean[]) obj);
        }
        return null;
    }

    public byte p(String key, byte defaultValue) {
        Object obj = this.a.get(key);
        if (obj instanceof Byte) {
            return ((Byte) obj).byteValue();
        }
        return defaultValue;
    }

    public byte[] q(String key) {
        Object obj = this.a.get(key);
        if (obj instanceof Byte[]) {
            return g((Byte[]) obj);
        }
        return null;
    }

    public double r(String key, double defaultValue) {
        Object obj = this.a.get(key);
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        return defaultValue;
    }

    public double[] s(String key) {
        Object obj = this.a.get(key);
        if (obj instanceof Double[]) {
            return h((Double[]) obj);
        }
        return null;
    }

    public float t(String key, float defaultValue) {
        Object obj = this.a.get(key);
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        return defaultValue;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.a.isEmpty()) {
            for (String str : this.a.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.a.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(C6566gU0.h);
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public float[] u(String key) {
        Object obj = this.a.get(key);
        if (obj instanceof Float[]) {
            return i((Float[]) obj);
        }
        return null;
    }

    public int v(String key, int defaultValue) {
        Object obj = this.a.get(key);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return defaultValue;
    }

    public int[] w(String key) {
        Object obj = this.a.get(key);
        if (obj instanceof Integer[]) {
            return j((Integer[]) obj);
        }
        return null;
    }

    public Map<String, Object> x() {
        return Collections.unmodifiableMap(this.a);
    }

    public long y(String key, long defaultValue) {
        Object obj = this.a.get(key);
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        return defaultValue;
    }

    public long[] z(String key) {
        Object obj = this.a.get(key);
        if (obj instanceof Long[]) {
            return k((Long[]) obj);
        }
        return null;
    }

    public b(b other) {
        this.a = new HashMap(other.a);
    }

    public b(Map<String, ?> values) {
        this.a = new HashMap(values);
    }
}
