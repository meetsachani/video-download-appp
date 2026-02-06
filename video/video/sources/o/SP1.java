package o;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class SP1 {
    public String a;
    public float b;
    public float c;
    public float d;

    public SP1(String str) {
        this.b = Float.NaN;
        this.c = Float.NaN;
        this.d = Float.NaN;
        this.a = str;
    }

    public static void a(String str, ArrayList<SP1> arrayList) {
        Object obj;
        if (str != null && str.length() != 0) {
            Object[] objArr = new Object[4];
            StringBuilder sb = new StringBuilder();
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < str.length(); i3++) {
                char charAt = str.charAt(i3);
                if (charAt != ' ' && charAt != '\'') {
                    if (charAt != ',') {
                        if (charAt != '[') {
                            if (charAt != ']') {
                                sb.append(charAt);
                            } else if (i2 > 0) {
                                i2--;
                                objArr[i] = sb.toString();
                                sb.setLength(0);
                                Object obj2 = objArr[0];
                                if (obj2 != null) {
                                    arrayList.add(new SP1(obj2.toString(), f(objArr[1]), f(objArr[2]), f(objArr[3])));
                                    Arrays.fill(objArr, (Object) null);
                                    i = 0;
                                }
                            }
                        } else {
                            i2++;
                        }
                    } else {
                        if (i < 3) {
                            objArr[i] = sb.toString();
                            sb.setLength(0);
                            i++;
                        }
                        if (i2 == 1 && (obj = objArr[0]) != null) {
                            arrayList.add(new SP1(obj.toString()));
                            objArr[0] = null;
                            i = 0;
                        }
                    }
                }
            }
        }
    }

    public static float f(Object obj) {
        try {
            return Float.parseFloat(obj.toString());
        } catch (Exception unused) {
            return Float.NaN;
        }
    }

    public static SP1 g(String str) {
        String[] split = str.replaceAll("[\\[\\]\\']", "").split(",");
        if (split.length == 0) {
            return null;
        }
        Object[] objArr = new Object[4];
        for (int i = 0; i < split.length && i < 4; i++) {
            objArr[i] = split[i];
        }
        return new SP1(objArr[0].toString().replace("'", ""), f(objArr[1]), f(objArr[2]), f(objArr[3]));
    }

    public String b() {
        return this.a;
    }

    public float c() {
        return this.d;
    }

    public float d() {
        return this.c;
    }

    public float e() {
        return this.b;
    }

    public void h(String str) {
        this.a = str;
    }

    public void i(float f) {
        this.d = f;
    }

    public void j(float f) {
        this.c = f;
    }

    public void k(float f) {
        this.b = f;
    }

    public String toString() {
        boolean z;
        float f;
        String str = this.a;
        if (str != null && str.length() != 0) {
            StringBuilder sb = new StringBuilder();
            if (Float.isNaN(this.b) && Float.isNaN(this.c) && Float.isNaN(this.d)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                sb.append(C6566gU0.f);
            }
            sb.append("'");
            sb.append(this.a);
            sb.append("'");
            float f2 = 0.0f;
            if (!Float.isNaN(this.d)) {
                sb.append(",");
                if (!Float.isNaN(this.b)) {
                    f = this.b;
                } else {
                    f = 0.0f;
                }
                sb.append(f);
                sb.append(",");
                if (!Float.isNaN(this.c)) {
                    f2 = this.c;
                }
                sb.append(f2);
                sb.append(",");
                sb.append(this.d);
            } else if (!Float.isNaN(this.c)) {
                sb.append(",");
                if (!Float.isNaN(this.b)) {
                    f2 = this.b;
                }
                sb.append(f2);
                sb.append(",");
                sb.append(this.c);
            } else if (!Float.isNaN(this.b)) {
                sb.append(",");
                sb.append(this.b);
            }
            if (z) {
                sb.append(C6566gU0.g);
            }
            sb.append(",");
            return sb.toString();
        }
        return "";
    }

    public SP1(String str, float f) {
        this.c = Float.NaN;
        this.d = Float.NaN;
        this.a = str;
        this.b = f;
    }

    public SP1(String str, float f, float f2) {
        this.d = Float.NaN;
        this.a = str;
        this.b = f;
        this.c = f2;
    }

    public SP1(String str, float f, float f2, float f3) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }
}
