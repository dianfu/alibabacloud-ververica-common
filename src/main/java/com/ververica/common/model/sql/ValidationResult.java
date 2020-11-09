package com.ververica.common.model.sql;

public enum ValidationResult {
  VALIDATION_RESULT_INVALID,
  /**
   * <code>VALIDATION_RESULT_INVALID_QUERY = 1;</code>
   */
  VALIDATION_RESULT_INVALID_QUERY,
  /**
   * <code>VALIDATION_RESULT_UNSUPPORTED_QUERY = 2;</code>
   */
  VALIDATION_RESULT_UNSUPPORTED_QUERY,
  /**
   * <code>VALIDATION_RESULT_VALID_INSERT_QUERY = 3;</code>
   */
  VALIDATION_RESULT_VALID_INSERT_QUERY,
  /**
   * <code>VALIDATION_RESULT_VALID_SELECT_QUERY = 4;</code>
   */
  VALIDATION_RESULT_VALID_SELECT_QUERY,
  /**
   * <code>VALIDATION_RESULT_VALID_DDL_STATEMENT = 5;</code>
   */
  VALIDATION_RESULT_VALID_DDL_STATEMENT,
  /**
   * <code>VALIDATION_RESULT_VALID_COMMAND_STATEMENT = 6;</code>
   */
  VALIDATION_RESULT_VALID_COMMAND_STATEMENT,
  UNRECOGNIZED
}
