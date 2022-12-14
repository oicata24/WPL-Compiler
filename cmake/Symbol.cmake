# Symbol component module

###############################################
# Modify this module as you see fit. It will
# depend upon how you design your symbol table
###############################################
include(LLVM)
set (SYMBOL_DIR ${CMAKE_SOURCE_DIR}/src/symbol)
set (SYMBOL_INCLUDE 
  ${SYMBOL_DIR}/include
  ${LLVM_INCLUDE_DIR}
)

set (SYMBOL_SOURCES
  ${SYMBOL_DIR}/Scope.cpp
  ${SYMBOL_DIR}/STManager.cpp
)