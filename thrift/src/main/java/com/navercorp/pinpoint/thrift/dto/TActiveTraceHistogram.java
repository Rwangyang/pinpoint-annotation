/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.navercorp.pinpoint.thrift.dto;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-03-16")
public class TActiveTraceHistogram implements org.apache.thrift.TBase<TActiveTraceHistogram, TActiveTraceHistogram._Fields>, java.io.Serializable, Cloneable, Comparable<TActiveTraceHistogram> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TActiveTraceHistogram");

  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I16, (short)1);
  private static final org.apache.thrift.protocol.TField HISTOGRAM_SCHEMA_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("histogramSchemaType", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField ACTIVE_TRACE_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("activeTraceCount", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TActiveTraceHistogramStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TActiveTraceHistogramTupleSchemeFactory();

  private short version; // required
  private int histogramSchemaType; // optional
  private java.util.List<java.lang.Integer> activeTraceCount; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    VERSION((short)1, "version"),
    HISTOGRAM_SCHEMA_TYPE((short)2, "histogramSchemaType"),
    ACTIVE_TRACE_COUNT((short)3, "activeTraceCount");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // VERSION
          return VERSION;
        case 2: // HISTOGRAM_SCHEMA_TYPE
          return HISTOGRAM_SCHEMA_TYPE;
        case 3: // ACTIVE_TRACE_COUNT
          return ACTIVE_TRACE_COUNT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __VERSION_ISSET_ID = 0;
  private static final int __HISTOGRAMSCHEMATYPE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.HISTOGRAM_SCHEMA_TYPE,_Fields.ACTIVE_TRACE_COUNT};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.HISTOGRAM_SCHEMA_TYPE, new org.apache.thrift.meta_data.FieldMetaData("histogramSchemaType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ACTIVE_TRACE_COUNT, new org.apache.thrift.meta_data.FieldMetaData("activeTraceCount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TActiveTraceHistogram.class, metaDataMap);
  }

  public TActiveTraceHistogram() {
    this.version = (short)0;

  }

  public TActiveTraceHistogram(
    short version)
  {
    this();
    this.version = version;
    setVersionIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TActiveTraceHistogram(TActiveTraceHistogram other) {
    __isset_bitfield = other.__isset_bitfield;
    this.version = other.version;
    this.histogramSchemaType = other.histogramSchemaType;
    if (other.isSetActiveTraceCount()) {
      java.util.List<java.lang.Integer> __this__activeTraceCount = new java.util.ArrayList<java.lang.Integer>(other.activeTraceCount);
      this.activeTraceCount = __this__activeTraceCount;
    }
  }

  public TActiveTraceHistogram deepCopy() {
    return new TActiveTraceHistogram(this);
  }

  @Override
  public void clear() {
    this.version = (short)0;

    setHistogramSchemaTypeIsSet(false);
    this.histogramSchemaType = 0;
    this.activeTraceCount = null;
  }

  public short getVersion() {
    return this.version;
  }

  public void setVersion(short version) {
    this.version = version;
    setVersionIsSet(true);
  }

  public void unsetVersion() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  public void setVersionIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __VERSION_ISSET_ID, value);
  }

  public int getHistogramSchemaType() {
    return this.histogramSchemaType;
  }

  public void setHistogramSchemaType(int histogramSchemaType) {
    this.histogramSchemaType = histogramSchemaType;
    setHistogramSchemaTypeIsSet(true);
  }

  public void unsetHistogramSchemaType() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __HISTOGRAMSCHEMATYPE_ISSET_ID);
  }

  /** Returns true if field histogramSchemaType is set (has been assigned a value) and false otherwise */
  public boolean isSetHistogramSchemaType() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __HISTOGRAMSCHEMATYPE_ISSET_ID);
  }

  public void setHistogramSchemaTypeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __HISTOGRAMSCHEMATYPE_ISSET_ID, value);
  }

  public int getActiveTraceCountSize() {
    return (this.activeTraceCount == null) ? 0 : this.activeTraceCount.size();
  }

  public java.util.Iterator<java.lang.Integer> getActiveTraceCountIterator() {
    return (this.activeTraceCount == null) ? null : this.activeTraceCount.iterator();
  }

  public void addToActiveTraceCount(int elem) {
    if (this.activeTraceCount == null) {
      this.activeTraceCount = new java.util.ArrayList<java.lang.Integer>();
    }
    this.activeTraceCount.add(elem);
  }

  public java.util.List<java.lang.Integer> getActiveTraceCount() {
    return this.activeTraceCount;
  }

  public void setActiveTraceCount(java.util.List<java.lang.Integer> activeTraceCount) {
    this.activeTraceCount = activeTraceCount;
  }

  public void unsetActiveTraceCount() {
    this.activeTraceCount = null;
  }

  /** Returns true if field activeTraceCount is set (has been assigned a value) and false otherwise */
  public boolean isSetActiveTraceCount() {
    return this.activeTraceCount != null;
  }

  public void setActiveTraceCountIsSet(boolean value) {
    if (!value) {
      this.activeTraceCount = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((java.lang.Short)value);
      }
      break;

    case HISTOGRAM_SCHEMA_TYPE:
      if (value == null) {
        unsetHistogramSchemaType();
      } else {
        setHistogramSchemaType((java.lang.Integer)value);
      }
      break;

    case ACTIVE_TRACE_COUNT:
      if (value == null) {
        unsetActiveTraceCount();
      } else {
        setActiveTraceCount((java.util.List<java.lang.Integer>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case VERSION:
      return getVersion();

    case HISTOGRAM_SCHEMA_TYPE:
      return getHistogramSchemaType();

    case ACTIVE_TRACE_COUNT:
      return getActiveTraceCount();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case VERSION:
      return isSetVersion();
    case HISTOGRAM_SCHEMA_TYPE:
      return isSetHistogramSchemaType();
    case ACTIVE_TRACE_COUNT:
      return isSetActiveTraceCount();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TActiveTraceHistogram)
      return this.equals((TActiveTraceHistogram)that);
    return false;
  }

  public boolean equals(TActiveTraceHistogram that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_version = true;
    boolean that_present_version = true;
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (this.version != that.version)
        return false;
    }

    boolean this_present_histogramSchemaType = true && this.isSetHistogramSchemaType();
    boolean that_present_histogramSchemaType = true && that.isSetHistogramSchemaType();
    if (this_present_histogramSchemaType || that_present_histogramSchemaType) {
      if (!(this_present_histogramSchemaType && that_present_histogramSchemaType))
        return false;
      if (this.histogramSchemaType != that.histogramSchemaType)
        return false;
    }

    boolean this_present_activeTraceCount = true && this.isSetActiveTraceCount();
    boolean that_present_activeTraceCount = true && that.isSetActiveTraceCount();
    if (this_present_activeTraceCount || that_present_activeTraceCount) {
      if (!(this_present_activeTraceCount && that_present_activeTraceCount))
        return false;
      if (!this.activeTraceCount.equals(that.activeTraceCount))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + version;

    hashCode = hashCode * 8191 + ((isSetHistogramSchemaType()) ? 131071 : 524287);
    if (isSetHistogramSchemaType())
      hashCode = hashCode * 8191 + histogramSchemaType;

    hashCode = hashCode * 8191 + ((isSetActiveTraceCount()) ? 131071 : 524287);
    if (isSetActiveTraceCount())
      hashCode = hashCode * 8191 + activeTraceCount.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TActiveTraceHistogram other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetVersion()).compareTo(other.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, other.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetHistogramSchemaType()).compareTo(other.isSetHistogramSchemaType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHistogramSchemaType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.histogramSchemaType, other.histogramSchemaType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetActiveTraceCount()).compareTo(other.isSetActiveTraceCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetActiveTraceCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.activeTraceCount, other.activeTraceCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TActiveTraceHistogram(");
    boolean first = true;

    sb.append("version:");
    sb.append(this.version);
    first = false;
    if (isSetHistogramSchemaType()) {
      if (!first) sb.append(", ");
      sb.append("histogramSchemaType:");
      sb.append(this.histogramSchemaType);
      first = false;
    }
    if (isSetActiveTraceCount()) {
      if (!first) sb.append(", ");
      sb.append("activeTraceCount:");
      if (this.activeTraceCount == null) {
        sb.append("null");
      } else {
        sb.append(this.activeTraceCount);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TActiveTraceHistogramStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TActiveTraceHistogramStandardScheme getScheme() {
      return new TActiveTraceHistogramStandardScheme();
    }
  }

  private static class TActiveTraceHistogramStandardScheme extends org.apache.thrift.scheme.StandardScheme<TActiveTraceHistogram> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TActiveTraceHistogram struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.version = iprot.readI16();
              struct.setVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HISTOGRAM_SCHEMA_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.histogramSchemaType = iprot.readI32();
              struct.setHistogramSchemaTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ACTIVE_TRACE_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list24 = iprot.readListBegin();
                struct.activeTraceCount = new java.util.ArrayList<java.lang.Integer>(_list24.size);
                int _elem25;
                for (int _i26 = 0; _i26 < _list24.size; ++_i26)
                {
                  _elem25 = iprot.readI32();
                  struct.activeTraceCount.add(_elem25);
                }
                iprot.readListEnd();
              }
              struct.setActiveTraceCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TActiveTraceHistogram struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(VERSION_FIELD_DESC);
      oprot.writeI16(struct.version);
      oprot.writeFieldEnd();
      if (struct.isSetHistogramSchemaType()) {
        oprot.writeFieldBegin(HISTOGRAM_SCHEMA_TYPE_FIELD_DESC);
        oprot.writeI32(struct.histogramSchemaType);
        oprot.writeFieldEnd();
      }
      if (struct.activeTraceCount != null) {
        if (struct.isSetActiveTraceCount()) {
          oprot.writeFieldBegin(ACTIVE_TRACE_COUNT_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.activeTraceCount.size()));
            for (int _iter27 : struct.activeTraceCount)
            {
              oprot.writeI32(_iter27);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TActiveTraceHistogramTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TActiveTraceHistogramTupleScheme getScheme() {
      return new TActiveTraceHistogramTupleScheme();
    }
  }

  private static class TActiveTraceHistogramTupleScheme extends org.apache.thrift.scheme.TupleScheme<TActiveTraceHistogram> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TActiveTraceHistogram struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetVersion()) {
        optionals.set(0);
      }
      if (struct.isSetHistogramSchemaType()) {
        optionals.set(1);
      }
      if (struct.isSetActiveTraceCount()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetVersion()) {
        oprot.writeI16(struct.version);
      }
      if (struct.isSetHistogramSchemaType()) {
        oprot.writeI32(struct.histogramSchemaType);
      }
      if (struct.isSetActiveTraceCount()) {
        {
          oprot.writeI32(struct.activeTraceCount.size());
          for (int _iter28 : struct.activeTraceCount)
          {
            oprot.writeI32(_iter28);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TActiveTraceHistogram struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.version = iprot.readI16();
        struct.setVersionIsSet(true);
      }
      if (incoming.get(1)) {
        struct.histogramSchemaType = iprot.readI32();
        struct.setHistogramSchemaTypeIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list29 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.activeTraceCount = new java.util.ArrayList<java.lang.Integer>(_list29.size);
          int _elem30;
          for (int _i31 = 0; _i31 < _list29.size; ++_i31)
          {
            _elem30 = iprot.readI32();
            struct.activeTraceCount.add(_elem30);
          }
        }
        struct.setActiveTraceCountIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

