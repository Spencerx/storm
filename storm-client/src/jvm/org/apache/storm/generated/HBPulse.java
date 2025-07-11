/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.22.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.storm.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.22.0)")
public class HBPulse implements org.apache.storm.thrift.TBase<HBPulse, HBPulse._Fields>, java.io.Serializable, Cloneable, Comparable<HBPulse> {
  private static final org.apache.storm.thrift.protocol.TStruct STRUCT_DESC = new org.apache.storm.thrift.protocol.TStruct("HBPulse");

  private static final org.apache.storm.thrift.protocol.TField ID_FIELD_DESC = new org.apache.storm.thrift.protocol.TField("id", org.apache.storm.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.storm.thrift.protocol.TField DETAILS_FIELD_DESC = new org.apache.storm.thrift.protocol.TField("details", org.apache.storm.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.storm.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new HBPulseStandardSchemeFactory();
  private static final org.apache.storm.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new HBPulseTupleSchemeFactory();

  private @org.apache.storm.thrift.annotation.Nullable java.lang.String id; // required
  private @org.apache.storm.thrift.annotation.Nullable java.nio.ByteBuffer details; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.storm.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    DETAILS((short)2, "details");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.storm.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // DETAILS
          return DETAILS;
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
    @org.apache.storm.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    @Override
    public short getThriftFieldId() {
      return _thriftId;
    }

    @Override
    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.storm.thrift.meta_data.FieldMetaData("id", org.apache.storm.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.storm.thrift.meta_data.FieldValueMetaData(org.apache.storm.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DETAILS, new org.apache.storm.thrift.meta_data.FieldMetaData("details", org.apache.storm.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.storm.thrift.meta_data.FieldValueMetaData(org.apache.storm.thrift.protocol.TType.STRING        , true)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.storm.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HBPulse.class, metaDataMap);
  }

  public HBPulse() {
  }

  public HBPulse(
    java.lang.String id,
    java.nio.ByteBuffer details)
  {
    this();
    this.id = id;
    this.details = org.apache.storm.thrift.TBaseHelper.copyBinary(details);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HBPulse(HBPulse other) {
    if (other.is_set_id()) {
      this.id = other.id;
    }
    if (other.is_set_details()) {
      this.details = org.apache.storm.thrift.TBaseHelper.copyBinary(other.details);
    }
  }

  @Override
  public HBPulse deepCopy() {
    return new HBPulse(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.details = null;
  }

  @org.apache.storm.thrift.annotation.Nullable
  public java.lang.String get_id() {
    return this.id;
  }

  public void set_id(@org.apache.storm.thrift.annotation.Nullable java.lang.String id) {
    this.id = id;
  }

  public void unset_id() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean is_set_id() {
    return this.id != null;
  }

  public void set_id_isSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public byte[] get_details() {
    set_details(org.apache.storm.thrift.TBaseHelper.rightSize(details));
    return details == null ? null : details.array();
  }

  public java.nio.ByteBuffer buffer_for_details() {
    return org.apache.storm.thrift.TBaseHelper.copyBinary(details);
  }

  public void set_details(byte[] details) {
    this.details = details == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(details.clone());
  }

  public void set_details(@org.apache.storm.thrift.annotation.Nullable java.nio.ByteBuffer details) {
    this.details = org.apache.storm.thrift.TBaseHelper.copyBinary(details);
  }

  public void unset_details() {
    this.details = null;
  }

  /** Returns true if field details is set (has been assigned a value) and false otherwise */
  public boolean is_set_details() {
    return this.details != null;
  }

  public void set_details_isSet(boolean value) {
    if (!value) {
      this.details = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.storm.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unset_id();
      } else {
        set_id((java.lang.String)value);
      }
      break;

    case DETAILS:
      if (value == null) {
        unset_details();
      } else {
        if (value instanceof byte[]) {
          set_details((byte[])value);
        } else {
          set_details((java.nio.ByteBuffer)value);
        }
      }
      break;

    }
  }

  @org.apache.storm.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return get_id();

    case DETAILS:
      return get_details();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  @Override
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return is_set_id();
    case DETAILS:
      return is_set_details();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof HBPulse)
      return this.equals((HBPulse)that);
    return false;
  }

  public boolean equals(HBPulse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true && this.is_set_id();
    boolean that_present_id = true && that.is_set_id();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_details = true && this.is_set_details();
    boolean that_present_details = true && that.is_set_details();
    if (this_present_details || that_present_details) {
      if (!(this_present_details && that_present_details))
        return false;
      if (!this.details.equals(that.details))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((is_set_id()) ? 131071 : 524287);
    if (is_set_id())
      hashCode = hashCode * 8191 + id.hashCode();

    hashCode = hashCode * 8191 + ((is_set_details()) ? 131071 : 524287);
    if (is_set_details())
      hashCode = hashCode * 8191 + details.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(HBPulse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(is_set_id(), other.is_set_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_id()) {
      lastComparison = org.apache.storm.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(is_set_details(), other.is_set_details());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_details()) {
      lastComparison = org.apache.storm.thrift.TBaseHelper.compareTo(this.details, other.details);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.storm.thrift.annotation.Nullable
  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  @Override
  public void read(org.apache.storm.thrift.protocol.TProtocol iprot) throws org.apache.storm.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  @Override
  public void write(org.apache.storm.thrift.protocol.TProtocol oprot) throws org.apache.storm.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("HBPulse(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("details:");
    if (this.details == null) {
      sb.append("null");
    } else {
      org.apache.storm.thrift.TBaseHelper.toString(this.details, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.storm.thrift.TException {
    // check for required fields
    if (!is_set_id()) {
      throw new org.apache.storm.thrift.protocol.TProtocolException("Required field 'id' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.storm.thrift.protocol.TCompactProtocol(new org.apache.storm.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.storm.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.storm.thrift.protocol.TCompactProtocol(new org.apache.storm.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.storm.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class HBPulseStandardSchemeFactory implements org.apache.storm.thrift.scheme.SchemeFactory {
    @Override
    public HBPulseStandardScheme getScheme() {
      return new HBPulseStandardScheme();
    }
  }

  private static class HBPulseStandardScheme extends org.apache.storm.thrift.scheme.StandardScheme<HBPulse> {

    @Override
    public void read(org.apache.storm.thrift.protocol.TProtocol iprot, HBPulse struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.storm.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.storm.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.set_id_isSet(true);
            } else { 
              org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DETAILS
            if (schemeField.type == org.apache.storm.thrift.protocol.TType.STRING) {
              struct.details = iprot.readBinary();
              struct.set_details_isSet(true);
            } else { 
              org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    @Override
    public void write(org.apache.storm.thrift.protocol.TProtocol oprot, HBPulse struct) throws org.apache.storm.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.details != null) {
        oprot.writeFieldBegin(DETAILS_FIELD_DESC);
        oprot.writeBinary(struct.details);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HBPulseTupleSchemeFactory implements org.apache.storm.thrift.scheme.SchemeFactory {
    @Override
    public HBPulseTupleScheme getScheme() {
      return new HBPulseTupleScheme();
    }
  }

  private static class HBPulseTupleScheme extends org.apache.storm.thrift.scheme.TupleScheme<HBPulse> {

    @Override
    public void write(org.apache.storm.thrift.protocol.TProtocol prot, HBPulse struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TTupleProtocol oprot = (org.apache.storm.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.id);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.is_set_details()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.is_set_details()) {
        oprot.writeBinary(struct.details);
      }
    }

    @Override
    public void read(org.apache.storm.thrift.protocol.TProtocol prot, HBPulse struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TTupleProtocol iprot = (org.apache.storm.thrift.protocol.TTupleProtocol) prot;
      struct.id = iprot.readString();
      struct.set_id_isSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.details = iprot.readBinary();
        struct.set_details_isSet(true);
      }
    }
  }

  private static <S extends org.apache.storm.thrift.scheme.IScheme> S scheme(org.apache.storm.thrift.protocol.TProtocol proto) {
    return (org.apache.storm.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

