package o;

import android.content.ContentValues;

/* renamed from: o.mM  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8007mM {
    public static final ContentValues a(C4180Rx1<String, ? extends Object>... c4180Rx1Arr) {
        ContentValues contentValues = new ContentValues(c4180Rx1Arr.length);
        for (C4180Rx1<String, ? extends Object> c4180Rx1 : c4180Rx1Arr) {
            String a = c4180Rx1.a();
            Object b = c4180Rx1.b();
            if (b == null) {
                contentValues.putNull(a);
            } else if (b instanceof String) {
                contentValues.put(a, (String) b);
            } else if (b instanceof Integer) {
                contentValues.put(a, (Integer) b);
            } else if (b instanceof Long) {
                contentValues.put(a, (Long) b);
            } else if (b instanceof Boolean) {
                contentValues.put(a, (Boolean) b);
            } else if (b instanceof Float) {
                contentValues.put(a, (Float) b);
            } else if (b instanceof Double) {
                contentValues.put(a, (Double) b);
            } else if (b instanceof byte[]) {
                contentValues.put(a, (byte[]) b);
            } else if (b instanceof Byte) {
                contentValues.put(a, (Byte) b);
            } else if (b instanceof Short) {
                contentValues.put(a, (Short) b);
            } else {
                throw new IllegalArgumentException("Illegal value type " + b.getClass().getCanonicalName() + " for key \"" + a + '\"');
            }
        }
        return contentValues;
    }
}
