package o;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class XR extends PR {
    private static final long serialVersionUID = 1;
    public final transient List<Field> Y0;
    public final Class<?> Z;

    public XR() {
        this.Z = null;
        this.Y0 = Collections.EMPTY_LIST;
    }

    public Class<?> e() {
        return this.Z;
    }

    public Field f() {
        if (C6748hF.L(this.Y0)) {
            return null;
        }
        return this.Y0.get(0);
    }

    public List<Field> g() {
        return this.Y0;
    }

    public XR(String str) {
        super(str);
        this.Z = null;
        this.Y0 = Collections.EMPTY_LIST;
    }

    public XR(Class<?> cls, Field field) {
        this.Z = cls;
        this.Y0 = Collections.singletonList(field);
    }

    public XR(Class<?> cls, List<Field> list) {
        this.Z = cls;
        this.Y0 = new C6735hB2(list);
    }

    public XR(Class<?> cls, String str) {
        super(str);
        this.Z = cls;
        this.Y0 = Collections.EMPTY_LIST;
    }

    public XR(Class<?> cls, Field field, String str) {
        super(str);
        this.Z = cls;
        this.Y0 = Collections.singletonList(field);
    }

    public XR(Class<?> cls, List<Field> list, String str) {
        super(str);
        this.Z = cls;
        this.Y0 = new C6735hB2(list);
    }
}
