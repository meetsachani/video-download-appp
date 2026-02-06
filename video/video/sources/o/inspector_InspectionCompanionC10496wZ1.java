package o;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.appcompat.widget.SearchView;
import o.OL1;

/* renamed from: o.wZ1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class inspector.InspectionCompanionC10496wZ1 implements InspectionCompanion {
    public boolean a = false;
    public int b;
    public int c;
    public int d;
    public int e;

    /* renamed from: a */
    public void readProperties(SearchView searchView, PropertyReader propertyReader) {
        if (this.a) {
            propertyReader.readInt(this.b, searchView.getImeOptions());
            propertyReader.readInt(this.c, searchView.getMaxWidth());
            propertyReader.readBoolean(this.d, searchView.P());
            propertyReader.readObject(this.e, searchView.getQueryHint());
            return;
        }
        throw C3412Kb.a();
    }

    public void mapProperties(PropertyMapper propertyMapper) {
        int mapInt;
        int mapInt2;
        int mapBoolean;
        int mapObject;
        mapInt = propertyMapper.mapInt("imeOptions", 16843364);
        this.b = mapInt;
        mapInt2 = propertyMapper.mapInt("maxWidth", 16843039);
        this.c = mapInt2;
        mapBoolean = propertyMapper.mapBoolean("iconifiedByDefault", OL1.b.J1);
        this.d = mapBoolean;
        mapObject = propertyMapper.mapObject("queryHint", OL1.b.G2);
        this.e = mapObject;
        this.a = true;
    }
}
