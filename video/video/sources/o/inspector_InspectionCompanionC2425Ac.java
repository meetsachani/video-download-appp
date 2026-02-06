package o;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import o.OL1;

/* renamed from: o.Ac  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class inspector.InspectionCompanionC2425Ac implements InspectionCompanion {
    public boolean a = false;
    public int b;
    public int c;
    public int d;
    public int e;

    /* renamed from: a */
    public void readProperties(C2523Bc c2523Bc, PropertyReader propertyReader) {
        if (this.a) {
            propertyReader.readObject(this.b, c2523Bc.getBackgroundTintList());
            propertyReader.readObject(this.c, c2523Bc.getBackgroundTintMode());
            propertyReader.readObject(this.d, c2523Bc.getCompoundDrawableTintList());
            propertyReader.readObject(this.e, c2523Bc.getCompoundDrawableTintMode());
            return;
        }
        throw C3412Kb.a();
    }

    public void mapProperties(PropertyMapper propertyMapper) {
        int mapObject;
        int mapObject2;
        int mapObject3;
        int mapObject4;
        mapObject = propertyMapper.mapObject("backgroundTint", OL1.b.b0);
        this.b = mapObject;
        mapObject2 = propertyMapper.mapObject("backgroundTintMode", OL1.b.c0);
        this.c = mapObject2;
        mapObject3 = propertyMapper.mapObject("drawableTint", OL1.b.l1);
        this.d = mapObject3;
        mapObject4 = propertyMapper.mapObject("drawableTintMode", OL1.b.m1);
        this.e = mapObject4;
        this.a = true;
    }
}
