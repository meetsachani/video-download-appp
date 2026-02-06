package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: o.z11  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC11094z11 {
    NULL,
    INT,
    LONG,
    FLOAT,
    DOUBLE,
    BOOLEAN,
    CHAR,
    STRING,
    ALL,
    PRIMITIVE;

    public static List<EnumC11094z11> e() {
        ArrayList arrayList = new ArrayList(Arrays.asList(values()));
        arrayList.remove(ALL);
        arrayList.remove(PRIMITIVE);
        return arrayList;
    }

    public static List<EnumC11094z11> g() {
        return Arrays.asList(INT, LONG, FLOAT, DOUBLE, BOOLEAN, CHAR);
    }
}
